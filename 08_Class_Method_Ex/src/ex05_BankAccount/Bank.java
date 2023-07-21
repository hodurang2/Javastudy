package ex05_BankAccount;

public class Bank {
  
  private String bankName;
  private String bankNo;
  
  // 생성자 메소드
  public Bank() {} // default 생성자
  
  public Bank(String bankName, String bankNo) {
    setBankName(bankName);
    setBankNo(bankNo);
  }
  
  // Setter 메소드
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  
  public void setBankNo(String bankNo) {
    this.bankNo = bankNo;
  }
  // Getter 메소드
  public String getBankName() {
    return bankName;
  }
  
  public String getBankNo() {
    return bankNo;
  }
  
  // 정보 호출 메소드
  public void info() {
    System.out.println(bankName + " (" + bankNo + ")\n");
  }
}
