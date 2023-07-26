package ex07_Object;

import java.util.Objects;

/*
 * java.lang.Object 클래스
 * 1. 모든 클래스의 최상위 슈퍼 클래스
 * 2. 별도의 슈퍼 클래스를 명시하지 않은 클래스들은(extends가 없는 클래스) 모두 Object 클래스의 서브 클래스이다.
 * 3. 모든 것을 Java의 만능 타입이다.
 * 4. Object 타입으로 저장하면 Object클래스의 메소드만 호출할 수 있다. 이를 해결하기 위해서 "반드시" 다운 캐스팅을 해야한다.
 * 5. 변수가 정수, 실수, 문자열로 저장 돼야한다면 데이터타입을 특정 불가능하므로 변수타입을 Object로 저장한다.
 */

/*
 * 상속 관계 도식
 *  ┌--------------┐
 *  │    Object    │ 슈퍼 클래스
 *  │--------------│
 *  │  equals()    │ 두 객체의 참조값을 비교햐서 같으면 true, 아니면 false 반환 -> 참조값이 아닌 다른걸 비교할 때(ex 이름) : Override이용
 *  │  getCalss()  │ 
 *  │  hashcode()  │ 
 *  │  toString()  │ 
 *  │  notify()    │ 
 *  │  wait()      │ 
 *  └--------------┘ 
 *          ▲
 *          │
 *          │
 *  ┌--------------┐
 *  │    Person    │ 서브 클래스
 *  │--------------│
 *  │              │
 *  │  @Override   │
 *  │  equals()    │ 참조값이 아닌 이름과 나이가 같으면 같은 객체로 할 것! (하드코딩하지 않고, Source에 만드는게 있음)
 *  │              │
 *  │  @Override   │
 *  │  @toString() │ 이름과 나이를 확인할 수 있는 문자열 반환 (하드코딩하지 않고, 자동완성 기능있음) -> 사용 빈도 높음
 *  │              │
 *  └--------------┘
 */
public class Person {
  
  private String name;
  private int age;
  
  // new Person()
  public Person() {
    
  }
  
  // new Person("정찬호", 26)
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)  // p1.equals(p1)
      return true;
    if (obj == null)  // p1.equals(null)
      return false;
    if (getClass() != obj.getClass())   // p1.equals(s1)
      return false;
    Person other = (Person) obj;
    return age == other.age && Objects.equals(name, other.name);
  }

  @Override
  public String toString() { 
    return "Person [name=" + name + ", age=" + age + "]";
  }
  

  
  
  
  
}
