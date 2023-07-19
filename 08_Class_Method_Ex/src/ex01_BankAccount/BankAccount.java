package ex01_BankAccount;

/**
 * 입금, 출금, 계좌조회, 이체 기능을 제공하는 클래스
 * @author HoduRang2
 * @since 2023.07.19
 * @version 1.0.0
 */

public class BankAccount {
  
  /**
   * long balance 이 필드는 계좌 잔액이다.<br>
   * 초깃값으로 0이 저장된다.
   */
  private long balance;
    
  /**
    * String accNo 이 필드는 계좌 번호이다.<br>
    * 초깃값으로 null
   */
  private String accNo;
  
  /**
   * 계좌번호와 통장잔액을 조회하는 메소드
   */
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("통장잔액: " + balance + "원");
  }
  
  /**
   * 입금 메소드<br>
   * 파라미터가 0보다 작으면 동작하지 않는다.
   * @param money 입금할 금액
   */
  public void deposit(long money) {
    if(money <= 0) {
      return;  // 메소드 종료
    }
    balance += money;
  }
  
  /**
   * 출금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 출금될 금액이 없으므로 0 반환
   * 파라미터가 통장잔액보다 많으면 출금될 금액이 없으므로 0반환
   * @param money 출금할 금액
   * @return 실세로 출금된 금액
   */
  public long withdrawal(long money) {
    long retVal = 0;
    if( (money > balance) || (money <= 0) ) {
      retVal = 0;
    } else {
      balance -= money;
      retVal = money;
    }
    return retVal;
  }
  
  /**
   * 송금 메소드
   * @param name
   * @param money
   */
  public long transfer(BankAccount name, long money, String account) {
    long retVal = 0;
    if( (money > balance) || (money <= 0) || (name.accNo != account) ) {
      retVal = 0;
    } else {
      balance -= money;
      name.balance += money;
      retVal = money;
    }
    return retVal;
  }
  
  public void setBalance(long money) {
    if(money <= 0) {
      return;
    }
    balance = money;
  }
  
  public void setAccNo(String accnum) {
    if(accnum.length() != 15) {
      return;
    }
    accNo = accnum;
  }
  
  public long getBalance() {
    return balance;
  }
  
  public String getAccNo() {
    return accNo;
  }
  
}
