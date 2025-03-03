
public class Transaction {
   private String operation;
   private double amount;
   private double balance;
   public static final String DEPOSIT = "deposit";
   public static final String WITHDRAW = "withdraw";


   /**
    * Transaction.
    * @param operation operation
    * @param amount amount
    * @param balance balance
    */
   Transaction(String operation, double amount, double balance) {
      this.operation = operation;
      this.amount = amount;
      this.balance = balance;
   }

   
   public double getAmount() {
      return amount;
   }

   
   public double getBalance() {
      return balance;
   }

   
   public static String getDeposit() {
      return DEPOSIT;
   }

   
   public String getOperation() {
      return operation;
   }

   
   public static String getWithdraw() {
      return WITHDRAW;
   }

   
   public void setAmount(double amount) {
      this.amount = amount;
   }

   
   public void setBalance(double balance) {
      this.balance = balance;
   }

   
   public void setOperation(String operation) {
      this.operation = operation;
   }

}
