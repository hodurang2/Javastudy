package ex02_return;

public class MainWrapper2 {
  /*
   * void 메소드의 return
   * 1. 반환값이 없는 메소는 void 키워드를 사용한다.
   * 2. 이런 경우 return; 키워드를 이용해서 메소드 실행을 종료할 수 있다.
   * 3. return 키워드만 작성해야 한다.
   */
  
  public static void main(String[] args) {
    positivePrint(10);
    positivePrint(-10);
  }
  public static void positivePrint(int num) {
    if(num < 0) {
      return;
    }
      System.out.println(num);
  }

}
