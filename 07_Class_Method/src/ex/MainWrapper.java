package ex;

public class MainWrapper {
  
  public static void ex01() {
    System.out.println("파라미터가 없는 ex01");
  }
  
  public static void ex01(String str) { // 파라미터 String str
    System.out.println("파라미터 String str = " + str);
  }
  
  public static void ex01(int a, int b) { // 파라미터 int a, 파라미터 int b
    
  }
  public static void main(String[] args) {
    ex01(); // ex01() 메소드에 전달하는 인수가 없다.
    ex01(); // ex01() 메소드에 인수 "hello woreld"를 전달한다.

  }

}
