package ex01_BankAccount;

public class BankAccount {
  
  private long balance;
  private String accNo;
  
  
  // new BankAccount(253890, "35489");
  public BankAccount(long balance, String accNo) {
    super();
    this.balance = balance;
    this.accNo = accNo;
  }
  
  /**
   * 조회 메소드<br>
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
   * @exception RuntimeException 입금할 금액이 0보다 작거나 같은 경우에 발생한다.
   */
  public void deposit(long money) {
    try {
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      balance += money;
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
  
  /**
   * 출금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 출금될 금액이 없으므로 0 반환
   * 파라미터가 통장잔액보다 많으면 출금될 금액이 없으므로 0반환
   * @param money 출금할 금액
   * @return 실세로 출금된 금액
   * @exception RuntimeException 잔액이 부족하거나 0보다 작은금액 출금 할 경우
   */
  public long withdrawal(long money) throws RuntimeException {
    long retVal = 0;
      if(money <= 0) {
        throw new RuntimeException(money + "원 출금 불가");
      } else if(money > balance) {
        throw new RuntimeException("잔액 부족");
      } else {
        balance -= money;
        retVal = money;
      }
    return retVal;
  }
  
  /**
   * 이체 메소드<br>
   * 기존의 입금메소드와 출금 메소드를 활용
   * 내 계좌에서 출금 먼저수행 출금된 금액만큼 다른계좌로 입금
   * @param name      송금받을 객체명
   * @param money     송금할 돈 (0보다 작거나 계좌잔액보다 적으면 0반환)
   * @throws RuntimeException 입금 메소드와 출금 메소드가 던진 예외를 다시 던진다.
   */
  public void transfer(BankAccount acc, long money) throws RuntimeException {
    acc.deposit(withdrawal(money));
  }
  
}
