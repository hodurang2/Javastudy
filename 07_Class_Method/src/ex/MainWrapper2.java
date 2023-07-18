package ex;

import java.util.Arrays;

public class MainWrapper2 {
  
  public static void ex01() {
    System.out.println("리턴이 없는 ex01");
  }
  
  // int : 리턴이 int 타입이다.
  public static int ex02() {
    return 100;
  }
  
  public static String ex03() {
    return "Hello world";
  }
  
  public static void main(String[] args) {
    String str = ex03();
    System.out.println(str);
  }

}
