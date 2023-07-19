package ex02_return;

import java.util.Arrays;

public class MainWrapper1 {
  
  /*
   * 반환(return)
   * 1. 메소드의 실행 결과 값을 의미한다.
   * 2. 반환이 업는 경우에는 void 키워드를 작성하고, 반환값이 있는 경우에는 반환값의 타입을 작성한다.
   */
  
  public static void main(String[] args) {
    System.out.println(getName("정찬호"));
    System.out.println(getAge());
    System.out.println(isAlive());    
    System.out.println(Arrays.toString(getHobbies()));
  }
  public static String[] getHobbies() {
    String[] hobbies = {"게임", "독서", "고양이랑놀기"};
    return hobbies; // 바로 {} 배열로 return 안됌 변수에 배열 할당하고 그 다음에 return
  }
  
  public static boolean isAlive() {
    return getAge() <= 100; // 메소드를 호출한 곳으로 반환한다.
  }

  public static int getAge() {
    return 26; // 메소드를 호출한 곳으로 반환한다.
  }
  
  public static String getName(String name) {
    String realname = name;
    return realname; // 메소드를 호출한 곳으로 반환한다.
  }
  
}
