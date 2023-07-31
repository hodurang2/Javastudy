package ex04_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainWrapper {
  
  
  
/*
 * HashMap
 * 1. Map인터페이스를 구현한 클래스.
 * 2. 객체(Object)/인스턴스(Instance)를 대신할 수 있는 자료구조.
 * 3. 용어
 *    1) Entry : key + Value를 합쳐서 는 말
 *    2) Key   : 데이터를 식별하는 식별자(변수명)
 *    3) Value : 데이터(변수에 저장된 값)
 * 4. 특징
 *    1) Key는 중복이 불가능 하다. (HashSet 구조로 되어 있다.)
 *    2) Value는 중복과 상관없이 값을 가질 수 이다.
 *    3) Key와 Value모두 Generic 처리한다.
 *    
 * 
 * 
 */
  
  
  public static void ex01() {
    
    // Map 인터페이스 타입으로 HashMap 선언
    Map<String, String> dict;
    
    // HashMap
    dict = new HashMap<String, String>();
    
    // Entry 저장(Key, Value)
    dict.put("봄", "spring");
    dict.put("여름", "summer");
    dict.put("가을", "autumn");
    dict.put("겨울", "winter");
    
    // Value 확인(Key전달)
    System.out.println(dict.get("봄"));
    System.out.println(dict.keySet());
    System.out.println(dict.values());
    System.out.println(dict.entrySet());
  }
  
  public static void ex02() {
    
    // HashMap 선언 & 생성
    Map<String, Object> person = new HashMap<String, Object>();
    
    // Entry 저장 (Key는 변수명, Value는 데이터)
    person.put("name", "정찬호");
    person.put("age", 25);
    
    // Entry 수정(기존의 Key를 사용하면 해당 Key의 Value가 수정되는 방식)
    person.replace("sd", "으아");
    person.put("name", "정치안호");
    
    // Value 확인
    System.out.println(person.get("name"));
    System.out.println(person.get("age"));
    
  }
  
  public static void ex03() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap<String, Object>();
    
    // Entry저장
    map.put("top", 30);
    map.put("botoom", 70);
    map.put("left", 10);
    map.put("right", 100);
    
    
    // 반복자(Iterator)를 이용한 HashMap순회
    // 1. Key만 모두 꺼내서 HashSet에 저장 (KeySet 메소드)
    // 2. Set에 반복자(Iterator)를 붙여서 Key를 하나씩 꺼낸다.
    // 3. get() 메소드에 Key를 전달하면 Value가 나온다.
    Set<String> keySet = map.keySet();
    Iterator<String> arm = keySet.iterator();
    
    while(arm.hasNext()) {
      String key = arm.next();
      Object value = map.get(key);
      System.out.println(key + ": " + value);
    }
    System.out.println("============");
    for(String key : keySet) {
      Object value = map.get(key);
      System.out.println(key + ": " + value);
    }
    
    
    
  }
  
  public static void ex04() {
    
    // HashMap 선언 & 생성
    Map<String, Object> map = new HashMap<String, Object>();
    
    // Entry추가
    map.put("id", "admin");
    map.put("pw", "1234");
    map.put("role", "DBA");
    
    // for문 순회 ( 주로 Entry 단위로 값을 뺌 entrySet()메소드 활용)
   for(Entry<String, Object> entry : map.entrySet()) {
     String key = entry.getKey();
     Object value = entry.getValue();
     System.out.println(key + ": " + value);
   }
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
    
  }

}
