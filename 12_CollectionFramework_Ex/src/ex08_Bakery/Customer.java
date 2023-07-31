package ex08_Bakery;

import java.util.Map;

public class Customer {

  private int count;        // 빵을 몇 개 샀는가?
  private int money;        // 얼마 가지고 있는가?
  
  // 생성자
  public Customer() {}      // 기본 생성자
  public Customer(int money) {
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
   * 구매 메소드<br>
   * 몇 개의 빵을 살 것인지, 얼마를 낼 것인지.
   * Bakery 클래스의 판매 메소드(sell)를 이용해서 구현
   * @param bakery 구매할 빵집
   * @param count  구매할 빵 갯수
   * @param money  구매할 때 낸돈
   */
  public void buy(Bakery bakery, int count, int money) {
    if(this.money < money) {
      money = this.money;
    }
    // bakery에 count와 money를 전달하고 빵과 잔돈을 받는다.
    Map<String, Integer> map = bakery.sell(count, money);
    
    // 구매처리
    if(map != null) {
      this.count += map.get("bread");
      this.money -= money;
      this.money += map.get("change");
    }
    
    
    
    
//    내가 짰던 코드    
//    bakery.setCount(bakery.getCount() - (money/bakery.PRICE));
//    bakery.setMoney(bakery.getMoney() + ((money / bakery.PRICE)*bakery.PRICE));
//    this.count += (money / bakery.PRICE);
//    this.money -= ((money / bakery.PRICE)*bakery.PRICE);
  }
}
