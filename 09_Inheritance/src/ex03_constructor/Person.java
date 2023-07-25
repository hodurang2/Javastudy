package ex03_constructor;

public class Person {
  
  private String name;
  
  // new Person()에서 호출 되는 생성자(constructor)
  public Person() {
    System.out.println("Person() 호출");
  }
  // new Person("정찬호")에서 호출되는 생성자(constructor)
  public Person(String name) {
    this.name = name;
    System.out.println("Person(String name) 호출");
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
}
