package ex;

public class MainWrapper {
  public static void main(String[] args) {
    
    // 초 -> 분/초
    int second = 90;
    int m = second / 60;  // 1
    int s = second % 60;  // 30
    System.out.println(second + "초는 " + m + "분 " + s + "초 입니다.");
    
    // x와 y값을 교환
    int x = 10; 
    int y = 20;
    int temp;
    temp = y;
    y = x;
    x = temp;
    System.out.println("x = " + x + ", y = " + y);
    
    // 5% 이자 받으면 얼마?(소수 이하는 버림)
    long balance = 123456L;  // 통장잔액
    double pct = 0.05;  // 5%
    balance *= (1 + pct);
    System.out.println("이자를 받으면 " + balance + "원 입니다.");

    // 90점대 점수이면 true, 아니면 false
    int score1 = 95;
    boolean result1 = ( score1 >= 90 ) && ( score1 < 100 );  // true
    System.out.println(score1 + "는 90점? " + result1);
    int score2 = 75;
    boolean result2 = ( score2 / 10 == 9 ) ;  // false
    System.out.println(score2 + "는 90점? " + result2);
    
    // num의 "짝수", "홀수", "3의배수" 여부 출력
    int n = 3;
    String res1 = (n % 2 == 0) ? n+"은 짝수" : n + "은 홀수";  // '홀수'
    System.out.println(res1);
    
    int num = 3;
    String res2 = ( num % 3 == 0 ) ? num + "은 3의 배수" : (num % 2 == 0) ? "짝수" : "홀수";
    System.out.println(res2);
   
  }
  
  
}
