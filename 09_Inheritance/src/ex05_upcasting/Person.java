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
  
}
