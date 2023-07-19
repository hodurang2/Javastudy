package ex01_parameter;

public class MainWrapper2 {
  
  /*
   * 메소드 오버로딩(Overloading)
   * 1. 같은 이름을 가지고 있는 메소드를 여러 개 만들 수 있다는 의미이다.
   * 2. 메소드 오버로딩의 조건
   *    1) 메소드 이름이 같다.
   *    2) 파라미터가 반드시 달라야 한다. (개수가 다르거나 ex) 인수 1개, 2개 or 타입이 다르거나 ex) boolean, int)
   */

  public static void main(String[] args) {
    print(10);
    print(1.5);
    print(10, 20);
  }
  public static void print(int a, int b) {
    System.out.println("ex01 : " + a);
    System.out.println("ex01 : " + b);
  }
  
  public static void print(double a) {
    System.out.println("ex01 : "+ a);
  }
  
  public static void print(int a) {
    System.out.println("ex01 : " + a);
  }
  
}
