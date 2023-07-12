package ex01_variable;

public class MainWrapper {
  
  public static void main(String[] args) {
    
    // single comment (한 줄 주석)
    /*
     * multiple comment
     * 다중 주석
     */
    /*
     * 키워드 규칙
     * 1. 프로젝트 : 맘대로
     * 2. 패키지 : 모두 소문자로 작성 (실무는 회사 도메인을 거꾸로 작성 ex: com.samsung.xxx)
     * 3. 클래스 : Upper Camel Case (단어 첫글자들이 대문자)
     * 4. 메소드 : lower Camel Case (가장 첫글자만 소문자이고 단어 첫글자들이 대문자)
     * 5. 변수   : lower Camel Case (가장 첫글자만 소문자이고 단어 첫글자들이 대문자)
     * 6. 상수   : Snake Case (대문자를 밑줄로 연결)
     */
    
    // 들여쓰기는 필수이다. 코드는 개발자의 얼굴이다.
    
    // 변수 선언하기
    
    // primitive type - 1 : 논리타입
    boolean isGood = true;
    boolean isAlive = false;
    // syso, sysout + Ctrl space (자동완성) = System.out.println();
    System.out.println(isAlive);
    System.out.println(isGood);
    
    // primitive type - 2 : 문자타입
    char ch1 = 'A';
    char ch2 = '정';
    System.out.println(ch1);
    System.out.println(ch2);
    
    // primitive type - 3 : 정수타입
    int score = 100;
    long money = 1000000000000000000L;
    System.out.println(score);
    System.out.println(money);
    
    // primitive type - 4 : 실수타입
    double commission = 0.5;
    System.out.println(commission);
    
    // 상수
    final double PI = 3.141592;  // 상수명 꼭 대문자로 해줄 것!
    System.out.println(PI);
    
    // reference type : 참조타입 
    String name = "tom";
    System.out.println(name);
    
    
    
    
    
    
    
    
    
    
  }
  
}
