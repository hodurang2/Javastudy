package ex03_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainWrapper {
  
  /*
   * Set
   * 1. 인덱스가 없다. 저장 순서가 없다.
   * 2. 중복 저장이 되지 않는다.
   */
  
  public static void ex01() {
    
    // Set 인터페이스 타입 선언
    Set<String> season;
    
    //HashSet 클래스 객체 생성
    season = new HashSet<String>();
    
    // 요소 추가하기
    season.add("봄");
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add("겨울");
    
    // 전체 확인
    System.out.println(season);   // HashSet클래스는 이미 toString이 @Override되어있음
    
  }
  
  public static void ex02() {
    
    
    // HashSet 선언 & 생성
    Set<String> hobbies = new HashSet<String>();
     
    // 요소 저장
    hobbies.add("독서");
    hobbies.add("게임");
    hobbies.add("영화시청");
    hobbies.add("명상");
     
    // for문 활용
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }

    
    
  }

  public static void ex03() {
    
    // HashSet 선언 & 생성
    Set<String> flower = new HashSet<String>();
    
    // 요소 저장
    flower.add("장미");
    flower.add("튤립");
    flower.add("마가렛");
    flower.add("백일홍");
    
    // 반복자를 Iterator를 이용한 Set 순회
    Iterator<String> arm = flower.iterator();
    
    // hasNext는 HashSet에서 데이터가 있는지 true/false로 반환
    
//    System.out.println(arm.hasNext()); 
//    System.out.println(arm.next());
//    
//    System.out.println(arm.hasNext()); 
//    System.out.println(arm.next());
//    
//    System.out.println(arm.hasNext()); 
//    System.out.println(arm.next());
//    
//    System.out.println(arm.hasNext()); 
//    System.out.println(arm.next());
//    
//    System.out.println(arm.hasNext()); 
    
    while(arm.hasNext()) {
      System.out.println(arm.next());
    }
    
    
  }
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
    ex03();
  }

}
