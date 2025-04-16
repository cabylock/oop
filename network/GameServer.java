


import java.io.*;
import java.net.*;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;



public class GameServer extends Thread {

   private ServerSocket serverSocket;
   private int port;
   private List<ClientHandler> clients = new CopyOnWriteArrayList<>();
   private boolean isRunning = true;



   public void startServer(int port) {
      this.port = port;
      this.start();
      System.out.println("Server started on port " + port);
   }

   @Override
   public void run() {
      try {
         serverSocket = new ServerSocket(port);

         while (isRunning) {
            Socket clientSocket = serverSocket.accept();
            ClientHandler clientHandler = new ClientHandler(clientSocket);
            clientHandler.start();
            clients.add(clientHandler);
         }
      } catch (IOException e) {
         System.err.println("Error starting server: " + e.getMessage());
      }
   }

   public void stopServer() {
      isRunning = false;
      try {
         for (ClientHandler client : clients) {
            client.sendMessage("Server is shutting down.");
            client.interrupt();
            client.clientSocket.close();
         }

         serverSocket.close();
         clients.clear();
         System.out.println("Server stopped.");

      } catch (IOException e) {
         System.err.println("Error stopping server: " + e.getMessage());
      }
   }

   public void broadcastMessage(String message) {
      for (ClientHandler client : clients) {
         client.sendMessage(message);
      }
   }

   private static class ClientHandler extends Thread {
      private Socket clientSocket;
      private ObjectInputStream in;

      private ObjectOutputStream out;
      private String clientName;
      private int clientPort;
      private String clientAddress;

      public ClientHandler(Socket socket) {
         this.clientSocket = socket;
         this.clientAddress = socket.getInetAddress().getHostAddress();
         this.clientPort = socket.getPort();
         this.clientName = clientAddress + ":" + clientPort;
         try {
            this.out = new ObjectOutputStream(clientSocket.getOutputStream());
            this.in = new ObjectInputStream(clientSocket.getInputStream());
         } catch (IOException e) {
            System.err.println("Error initializing streams for client: " + e.getMessage());
            out = null;
            in = null;
         }
      }

      @Override
      public void run() {
         try {
            while (true) {

               // Example of receiving a message from the client
               String message = in.readUTF();
               if ("STRING".equals(message)) {
                  message = in.readUTF();
                  System.out.println("Client " + clientName + " sent: " + message);
               } else if ("LIST".equals(message)) {
                  Object obj = in.readObject();

                  if (obj instanceof List<?>) {
                     List<?> data = (List<?>) obj;
                     System.out.println("Client " + clientName + " sent a list of size: " + data.size());
                     for (Object item : data) {
                        System.out.println("Item: " + item);
                     }

                  } else {
                     System.out.println("Unknown message type from client " + clientName);
                  }

               }
            }
         } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error handling client: " + e.getMessage());
         }

         finally {
            try {
               clientSocket.close();
            } catch (IOException e) {
               System.err.println("Error closing client socket: " + e.getMessage());
            }
         }
      }

      public void sendMessage(String message) {
         try {
            out.writeUTF("STRING"); // Indicate the type of message
            out.writeUTF(message); // Send the message
            out.flush(); // Ensure the data is sent immediately
         } catch (IOException e) {
            System.err.println("Error sending message: " + e.getMessage());
         }
      }

   }

   public static void main(String[] args) {
      GameServer server = new GameServer();
      server.startServer(8080);

      Scanner scanner = new Scanner(System.in);
      while (true) {
         System.out.println("Enter 'stop' to stop the server:");
         String command = scanner.nextLine();
         if (command.equalsIgnoreCase("stop")) {
            server.stopServer();
            scanner.close();
            break;
         }
         server.broadcastMessage(command);
      }
   }
}
