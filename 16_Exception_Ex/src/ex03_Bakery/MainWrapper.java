package ex03_Bakery;

public class MainWrapper {

  public static void main(String[] args) {

    Bakery bakery = new Bakery(30, 10000);     // 빵 100개, 빵 가격 1000원, 빵집 예산 10000원
    Customer customer = new Customer(150000);          // 빵 0개, 10000원 가지고 빵 돌격
    
    try {
      customer.buy(bakery, 30, 50000);                       // 빵 2000원 빵3개, 거스름돈 4000원
      customer.buy(bakery, 20, 20000);                       // 빵 2000원 빵3개, 거스름돈 4000원
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
    
    System.out.println("빵집 money: " + bakery.getMoney() + "원");
    System.out.println("빵집 빵: " + bakery.getCount() + "개");
    System.out.println("고객 money: " + customer.getMoney() + "원");
    System.out.println("고객 빵: " + customer.getCount() + "개");
  }

}
