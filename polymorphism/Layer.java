import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

public class Layer extends JPanel {

   private List<Shape> shapes;

   public Layer() {
      shapes = new ArrayList<Shape>();
      setFocusable(true);

      // Add a KeyListener to handle keyboard input
      addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            Random random = new Random();
            switch (key) {
               case KeyEvent.VK_S:
                  Square square = new Square(
                        new Point(random.nextInt(600), random.nextInt(400)), random.nextInt(100),
                        "yellow", true);
                  addShape(square);
                  repaint();

                  break;
               case KeyEvent.VK_R:
                  Rectangle rectangle = new Rectangle(
                        new Point(random.nextInt(600), random.nextInt(400)), random.nextInt(100),
                        random.nextInt(100), "red", true);
                  addShape(rectangle);
                  repaint();

                  break;
               case KeyEvent.VK_C:
                  // Create a circle
                  Circle circle = new Circle(
                        new Point(random.nextInt(600), random.nextInt(400)), random.nextInt(100),
                        "blue", true);
                  addShape(circle);
                  repaint();
                  break;

               case KeyEvent.VK_J:
                  removeCircles();
                  repaint();
                  break;
               case KeyEvent.VK_D:
                  removeDuplicates();
                  repaint();
                  break;
               // Add more cases as needed
            }
         }
      });

      // Add MouseListener separately
      addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(java.awt.event.MouseEvent e) {
            requestFocusInWindow();
         }
      });

      // In Layer constructor
      Timer timer = new Timer(500, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Move all shapes to random positions
            for (Shape shape : shapes) {
               shape.move();
            }
            repaint();
         }
      });
      timer.start();
   }

   @Override
   public void paintComponent(java.awt.Graphics g) {
      super.paintComponent(g);
      for (Shape shape : shapes) {
         shape.draw(g);
      }
   }

   public void addShape(Shape shape) {
      shapes.add(shape);
   }

   /**
    * get info of all shapes in layer.
    * 
    * @return String
    */
   public String getInfo() {
      String info = "";
      info += "Layer of crazy shapes:\n";
      for (Shape shape : shapes) {
         info += shape.toString() + "\n";
      }
      return info;
   }

   /**
    * remove all circles in layer.
    */
   public void removeCircles() {
      for (int i = 0; i < shapes.size(); i++) {
         if (shapes.get(i) instanceof Circle) {
            shapes.remove(i);
            i--;
         }
      }
   }

   /**
    * remove all triangles in layer.
    */
   public void removeDuplicates() {
      for (int i = 0; i < shapes.size(); i++) {
         for (int j = i + 1; j < shapes.size(); j++) {
            if (shapes.get(i).equals(shapes.get(j))) {
               shapes.remove(j);
               j--;
            }
         }
      }
   }

   public static void main(String[] args) {
      Layer layer = new Layer();

      JFrame frame = new JFrame("Layer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(layer);
      frame.setSize(800, 600);
      frame.setVisible(true);

      layer.requestFocusInWindow();

   }

}
