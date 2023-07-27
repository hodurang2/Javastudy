package ex02_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainWrapper {
  
  public static void ex01() {
    
    // ArrayList의 인터페이스 List 타입 선언
    List<String> season;
    
    // ArrayList 생성
    season = new ArrayList<String>();
    
    //배열 요소 추가하기
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add(0, "봄");
    
    // 배열 요소 확인
    System.out.println(season.get(0));
    System.out.println(season.get(1));
    System.out.println(season.get(2));
    System.out.println(season.get(3));
    
    
  }

  public static void ex02() {
    
    // ArrayList의 선언 & 생성
    List<String> hobbies = new ArrayList<String>();
    
    // 배열 요소 추가하기
    hobbies.add("컴퓨터 게임");
    hobbies.add("독서");
    hobbies.add("코딩");
    
    // 배열 길이 확인하기 (저장된 요소의 갯수)
    System.out.println(hobbies.size());
    
    // 배열 길이 관련 (마지막 요소 꺼내기)
    System.out.println(hobbies.get(hobbies.size() - 1));
    
    // 배열 for문 적용하기
    for(int i = 0; i < hobbies.size(); i++) {
      System.out.println(hobbies.get(i));
    }

    // 배열 for문 적용하기 (리팩토링 : hobbies.size() 메소드가 여러 번 호출되는 문제 해결)
    for(int i = 0, length = hobbies.size(); i < length; i++) {  
      // for문은 초기문만 한번 실행되고 조건문 -> 실행문 -> 증감문 순인데 
      // 메소드를 여러번 부르면 성능이 안좋아질 수 있어서 초기문에서 변수에 할당하고 그 변수를 이용하는게 성능에 좋다
      System.out.println(hobbies.get(i));
    }
    
  }

  public static void ex03() {
    
    // ArrayList 선언 & 생성
    List<String> flower = new ArrayList<String>();
    
    // 요소 추가
    flower.add("장미");
    flower.add("튤립");
    flower.add("라그라스");
    
    // 요소 수정하기
    flower.set(0, "백일홍");   // 인덱스 0의 요소 장미 -> 백일홍으로 변경
    flower.set(1, "마가렛");   // 인덱스 1의 요소 튤립 -> 마가렛으로 변경
    
    // 요소 삭제하기
    flower.remove(1); // 인덱스 1의 요소 마가렛 삭제
    
    // for문
    for(int i = 0, length = flower.size(); i < length; i++) {
      System.out.println(flower.get(i));
    }
    
  }  
  
  public static void ex04() {
    
    // 배열을 ArrayList로 바꾸기
    Integer[] a = {10, 20, 30, 40, 50};
    List<Integer> numbers = Arrays.asList(a);
    
    // 주의 할 점 초기화된 ArrayList는 길이 변경 불가능 
//    numbers.add(60);  불가능
//    numbers.remove(0); 불가능
    
    // for문
    for(int i = 0, length = numbers.size(); i < length; i++) {
      System.out.println(numbers.get(i));
    }
    
  }
  
  public static void ex05() {
    
    // ArrayList 초기화 
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
//    numbers.add(300); Arrays.asList로 만든건 add, remove 다안됨
    
    // for문
    for(int i = 0, length = numbers.size(); i < length; i++) {
      System.out.println(numbers.get(i));
    }
    
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
    ex05();
  }

}
