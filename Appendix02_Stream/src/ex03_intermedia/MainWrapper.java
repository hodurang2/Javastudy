package ex03_intermedia;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainWrapper {
  
  public static void ex01() {
    
    // 필터 : 원하는 요소만 사용
    
    // List 생성
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // 홀수만 출력하기
    list.stream()
      .filter((num) -> (num % 2 == 1))          // 조건 -> filter가 Predicate을 받았음 
      .forEach((n) -> System.out.println(n));   // 할 일 
    
  }
  
  public static void ex02() {
    
    // 필터
    
    // List
    List<Person> list = Arrays.asList(
        new Person("정찬호", 25),
        new Person("정친후", 52),
        new Person("정천호", 73),
        new Person("정찬희", 3)
    );
    
    // age가 20이상인 Person을 List로 생성
    List<Person> adult = list.stream()
                              .filter((person) -> (person.getAge() >= 20))
                             .collect(Collectors.toList());
    
    // adult 확인
    adult.stream()
          .forEach((person) -> System.out.println(person.getName() + ", " + person.getAge()));
    
    
  }
  
  public static void ex03() {
    
    // 변환 (값을 바꿈)
    
    // List 생성 
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
    
    // 1씩 증가시키기
    list.stream()
        .map((num) -> num+1)
        .forEach((num) -> System.out.println(num));
    
  }
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
    ex03();
    
  }

}
