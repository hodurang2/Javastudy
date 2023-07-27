package ex01_Person;

import java.util.ArrayList;
import java.util.List;

public class MainWrapper {

  public static void main(String[] args) {
    
    List<Person> family = new ArrayList<Person>();
    
    // 리스트 요소 추가
    family.add(new Person("엄마", 51));
    family.add(new Person("아빠", 54));
    family.add(new Person("나", 25));
    family.add(new Person("동생", 23));
    family.add(new Person("랑이", 3));
    family.add(new Person("호두", 2));
    // for문 출력
    for(int i = 0, length = family.size(); i < length; i++) {
      System.out.println("이름: " + family.get(i).getName() + ", 나이: " + family.get(i).getAge());
    }
    
  }

}
