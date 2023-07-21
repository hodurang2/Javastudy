package ex05_BankAccount;

public class BankAccount {
  
  private long balance;
  private Bank bank;
  private String account;
  
  public BankAccount() {}  // default 생성자
  
  public BankAccount(Bank bank, String account, long balance) {
    this.bank = bank;
    this.account = account;
    this.balance = balance;

  }
  
  // Setter 메소드
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  
  public void setAccNo(String account) {
    this.account = account;
  }
  
  public void setBalance(long balance) {
    if(balance <= 0) {
      return;
    }
    this.balance += balance;
  }
  
  // Getter 메소드
  public Bank getBank() {
    return bank;
  }
  
  public String getAccNo() {
    return account;
  }
  
  public long getBalance() {
    return balance;
  }
  
  // 입, 출, 송금 메소드
  public void deposit(long money) {
    if(balance <= 0) {
      return;
    }
    balance += money;
  }
  
  public long withdrawal(long money) {
    long retVal = 0;
    if(money > 0 && money <= balance) {
      balance -= money;
      retVal = money;            
    } 
    return retVal;
  }
  
  
  // 정보 호출 메소드
  public void info() {
    System.out.println("계좌번호: " + account + ", 통장잔액: " + balance + "원");
    System.out.print("개설지점: ");
    bank.info();
  }
  
}
