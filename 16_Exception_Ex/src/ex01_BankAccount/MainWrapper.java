package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    
    try {
      BankAccount acc1 = new BankAccount(10000, "1234");
      BankAccount acc2 = new BankAccount(10000, "1111");
      
      acc1.deposit(10000);
      acc2.deposit(10000);
      long money = acc1.withdrawal(5000);
      System.out.println("출금액 " + money);
      
      acc1.transfer(acc2, 5000);
      
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
  
  

}
