package ex03_Bakery;

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

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
   * @throws RuntimeException 돈부족 빵부족 손놈 돈을 조금냄
   */
  public Map<String, Integer> sell(int count, int money) throws RuntimeException {
    
    // 0 이하의 빵을 요청했다.
    if(count <= 0) {
      throw new RuntimeException("판매 불가합니다. ( 0 이하의 빵 요청)");
    }
    
    // 빵이 부족
    if(this.count == 0) {
      throw new RuntimeException("======매진======");
    }
    
    if(this.count < count) {
      count = this.count;
      System.out.println("남은거라도 줄게");
    }
    
    // 고객이 돈을 안 냈다.
    if(money <= 0) {
      throw new RuntimeException("손놈");
    }
    
    // 고객이 낸 돈이 모자르다.
    if(PRICE * count > money) {
      count = money /PRICE;
      System.out.println("돈에 맞춰서 드렸습니다.");
    }
    
    // 판매 처리
    this.count -= count;
    this.money += money;
    
    // 고객에게 반환할 Map 생성
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("bread", count);
    map.put("change", money - count * PRICE);
    
    
    // 고객에게 빵과 잔돈 반환
    return map;
  }
  
}
