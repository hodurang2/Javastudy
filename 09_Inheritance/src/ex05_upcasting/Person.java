package ex05_upcasting;

public class Person {
  
  private String name;
  
  // new Person()
  public Person() {}
  
  // new Person("정찬호")
  public Person(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("냠냠");
  }
  public void sleep() {
    System.out.println("쿨쿨");
  }
  
  public void info() {
    System.out.println("이름: " + name);
  }

  public void study() {}    // 실행이 아닌 호출 목적 메소드
  public void working() {}  // 실행이 아닌 호출 목적 메소드
}
