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
    
    // Short Circuit Evaluation
    // 1. 논리 AND : 결과가 false인 조건이 나타나면 더이상 조건을 체크하지않는다. 최종 결과는 false이다.
    // 2. 논리 OR  : 결과가 true인 조건이 나타나면 더 이상 조건을 체크하지않는다. 최종 결과는 true이다.
    int i = 10;
    int j = 10;
    
    boolean andSceResult = (++i == 10) && (++j == 10);  
    // ++i에서 i가 11이 됐고 11 == 10은 false이기 때문에 이미 조건에서 틀렸으므로 ++j는 실행되지 않는다.
    System.out.println(andSceResult);
    System.out.println(i);
    System.out.println(j);
    
    boolean orSceResult = ( j++ == 10 ) || ( i++ == 10 ); 
    // j++에서 후위증감이기 때문에 논리연산에 j 사용후 ++된다 그리고 OR에서 이미 true가 되었기 때문에 뒤 i++ 는 진행하지 않는다.
    System.out.println(orSceResult);
    System.out.println(i);
    System.out.println(j);
        
  }

  // ex05 메소드 만들기
  public static void ex05() {
    
    // 조건 연산자 ( 3개의 항을 사용하므로 삼항 연산이라고도 한다. )
    // 조건식 ? true인 경우 결과 : false인 경우 결과
    
    int score = 100;
    
    String result = ( score >= 60 ) ? "합격" : "불합격";
    System.out.println(result);
    
  }
  
  //ex06 메소드 만들기
  public static void ex06() {
    
    // 문자열 연결
    String str1 = "랑이" + "호두";
    String str2 = 4 + "달라";
    String str3 = 1 + 2 + "번지";
    System.out.println("\n문자열 연결하기");
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    
    // 정수 -> 문자열
    // 실수 -> 문자열
    System.out.println("\n빈문자열로(\"\") 숫자 문자열로 바꾸기");
    String str4 = 100 + ""; // 빈 문자열 더하기
    String str5 = 1.5 + ""; // 빈 문자열 더하기
    
    
    
    //참고. 문자열로 변환하는 메소드가 있다.
    String str6 = String.valueOf(100); // 잘 안 쓸 뿐
    System.out.println("\n문자열로 변환하는 메소드");
    System.out.println(str6);
    
  }
 
  public static void main(String[] args) {
    // ex01 메소드 실행 부탁
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
    ex06();
    
  }
}