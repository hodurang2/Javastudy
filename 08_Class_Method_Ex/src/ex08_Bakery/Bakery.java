package ex08_Bakery;

// 1가지 빵만 파는 빵집

public class Bakery {

  public final int PRICE = 2000;      // 빵이 얼마인가?
  private int count;      // 빵이 몇 개 있는가?
  private int money;      // 빵집에 돈이 얼마있는가?
  
  // 생성자
  public Bakery() {}      // 기본 생성자
  public Bakery(int count, int money) {
    setCount(count);
    setMoney(money);
  }
  
  // Setter 메소드
  public void setCount(int count) {
    this.count = count;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  // Getter 메소드
  public int getCount() {
    return count;
  }
  public int getMoney() {
    return money;
  }
  
  // 행동 메소드
  /**
   * 판매 메소드<br>
   * 고객으로부터 구매할 빵의 갯수와 돈을 전달 받아서 판매한다.
   * @param count 구매할 빵의 갯수
   * @param money 소비자가 낸 돈
   * @return 빵, 잔돈
   */
  public BreadChange sell(int count, int money) {
    
    // 빵이 부족
    if(this.count == 0) {
      System.out.println("======매진======");
    }
    
    if(this.count < count) {
      System.out.println("남은거라도 줄게");
      count = this.count;
    }
    
    // 고객이 돈을 안 냈다.
    if(money <= 0) {
      System.out.println("손놈");
      return null;
    }
    
    // 고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      count = money /PRICE;
      System.out.println("돈에 맞춰서 줬다이");
    }
    
    // 판매 처리
    this.count -= count;
    this.money += money;
    
    // 고객에게 돌려줄 BreadChange 객체 생성
    BreadChange bc = new BreadChange(count, money - count * PRICE);
    
    // 고객에게 빵과 잔돈 반환
    return bc;
  }
  
}
