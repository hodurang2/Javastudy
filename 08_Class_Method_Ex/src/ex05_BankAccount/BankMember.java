package ex05_BankAccount;

public class BankMember {
  
  private BankAccount bankAcc;
  private String name;
  
  // 생성자 메소드
  public BankMember() {} // default 생성자
  
  public BankMember(String name, BankAccount bankacc) {
    this.name = name;
    this.bankAcc = bankacc;
  }
  
  // Setter 메소드
  public void setAcc(BankAccount bankAcc) {
    this.bankAcc = bankAcc;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  // Getter 메소드
  public BankAccount getAcc() {
    return bankAcc;
  }
  
  public Bank getBank() {
    return bankAcc.getBank();
  }
  
  public String getName() {
    return name;
  }  
  
  // 입, 출, 송금 메소드
  public void deposit(long money) {
    bankAcc.deposit(money);
  }
  
  public long withdrawal(long moeny) {
    return bankAcc.withdrawal(moeny);
  }
  
  public void transfer(BankMember member, long money) {
    member.deposit(withdrawal(money));
  }
  
  // 정보 호출 메소드
  public void info() {
    System.out.println("고객명: " + name);
    bankAcc.info();
  }
  
}