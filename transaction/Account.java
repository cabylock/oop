package transaction;
import java.util.ArrayList;

public class Account {
   private double balance;
   private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

   /*
    * deposit.
    * 
    * @param amount so tien can nap
    */
   private void deposit(double amount) {
      if (amount <= 0) {
         System.out.println("So tien ban nap vao khong hop le!");
      } else {
         balance += amount;
         transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
      }
   }

   /**
    * withdraw.
    * 
    * @param amount so tien can rut
    */
   private void withdraw(double amount) {
      if (amount <= 0) {
         System.out.println("So tien ban rut ra khong hop le!");
      } else if (amount > balance) {
         System.out.println("So tien ban rut vuot qua so du!");
      } else {
         balance -= amount;
         transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
      }

   }

   /**
    * addTransaction.
    * 
    * @param amount    amount
    * @param operation operation
    */
   public void addTransaction(double amount, String operation) {
      if (operation.equals(Transaction.DEPOSIT)) {
         deposit(amount);
      } else if (operation.equals(Transaction.WITHDRAW)) {
         withdraw(amount);
      } else {
         System.out.println("Yeu cau khong hop le!");
      }
   }

   /**
    * printTransaction.
    * In ra lich
    */
   public void printTransaction() {
      for (int i = 0; i < transitionList.size(); i++) {
         String operation = transitionList.get(i).getOperation();
         double amount = transitionList.get(i).getAmount();
         double balance = transitionList.get(i).getBalance();
         if (operation.equals(Transaction.DEPOSIT)) {
            System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                  + String.format("%.2f", amount)
                  + ". So du luc nay: $" + String.format("%.2f", balance) + ".");
         } else {
            System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                  + String.format("%.2f", amount)
                  + ". So du luc nay: $" + String.format("%.2f", balance) + ".");
         }
      }
   }

}
