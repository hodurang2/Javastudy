package ex03_operator;

public class MainWrapper {

  // ex01 메소드 만들기
  public static void ex01() {
    
    int a = 5;
    int b = 2;
    
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int mok = a / b;  // 몫
    int mod = a % b;  // 나머지
    
    System.out.println("int 단순 연산 : 합, 차, 곱, 몫, 나머지");
    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);
    
    double x = 5;
    double y = 2;
    
    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double mokResult = x / y;
    double modResult = x % y;

    System.out.println("\ndouble 단순 연산");
    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(mokResult);
    System.out.println(modResult);
    
    int i = 5;
    int j = 2;
    
    double result = (double)i / j;
    System.out.println("\nint i, j 나누기 소숫점 표현");
    System.out.println(result);
    
  }
  
  // ex02 메소드 만들기
  public static void ex02() {
    
    // 증감 연산 (++, --)
    
    // 전위 연산 (먼저 증감)
    int a = 10;
    System.out.println("\n전위 연산 : 증가 후 -> 출력");
    System.out.println(++a);      // 증가 후 -> 출력
    System.out.println(a);
    
    // 후위 연산 (나중에 증감)
    int b = 10;
    System.out.println("\n후위 연산 : 출력 후 -> 증가");
    System.out.println(b++);      // 출력 후 -> 증가
    System.out.println(b);
  }
  
  // ex03 메소드 만들기
  public static void ex03() {
    
    // 대입 연산
    int a = 10;
    int b = a;
    System.out.println("\n대입 연산");
    System.out.println(a);
    System.out.println(b);
    
    // 복합 대입 연산
    int x = 10;
    int y = 1;
    y += x;
    System.out.println("\n복합 대입 연산");
    System.out.println(x);
    System.out.println(y);
    
  }
  
  // ex04 메소드 만들기
  public static void ex04() {
    
    // 관계 연산
    int a = 3;
    int b = 5;
    int c = 3;
    
    boolean result1 = a > b;
    boolean result2 = a >= b;
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b;
    boolean result6 = a == c;
    
    System.out.println("\n관계 연산");
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    // 논리 연산
    // 1. 논리 AND : &&, 모든 조건이 만족하면 true, 아니면 false
    // 2. 논리 OR  : ||, 하나의 조건이라도 만족하면 true, 아니면 false
    // 3. 논리 NOT : ! , 조건 결과가 true이면 false, 조건 결과가 false이면 true
    int x = 10;
    int y = 20;
    
    boolean andResult = ( x == 10 ) && ( y == 10 );
    boolean orResult = ( x == 10 ) || ( y == 10 );
    boolean notResult = !( x == 10 );
    
    System.out.println("\n논리 연산 : AND, OR, NOT");
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
    
  }
  
  
  public static void main(String[] args) {
    // ex01 메소드 실행 부탁
    ex01();
    ex02();
    ex03();
    ex04();

  }

}
