package ex01_Person;

public class Person {
  
  private String name;
  private int age;
  
  public Person() {}

  public Person(String name, int age) {
    super();
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
  public String toString() {  // Object클래스에 있는 toString 메소드에 내가 오버라이딩 한것
    return "Person [name=" + name + ", age=" + age + "]";
  }
  
  
}
