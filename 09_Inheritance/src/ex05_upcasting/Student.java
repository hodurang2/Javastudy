package ex05_upcasting;

public class Student extends Person{
  
  private String school;
  
  // new Student()
  public Student() { 
    // 반드시 슈퍼 클래스의 새성자 호출이 있어야 하기 때문에,
    // 개발자가 슈퍼 클래스의 생성자를 호출하지 않으면 Java가 직접 슈퍼 클래스의 생성자를 호출한다.
    // Java가 호출하는 슈퍼 클래스의 생성자는 "디폴트 생성자"만 가능하다.
    super(); // 슈퍼 클래스의 "디폴트 생성자"
  }
  
  // new Student("홍길동", 수원대학교)
  public Student(String name, String school) {
    // new Person("정찬호") 호출을 위한 코드
    super(name);
    this.school = school;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }
  
  @Override
  public void study() {
    System.out.println("열공");
  }
  
  @Override
  public void info() {
    System.out.println("이름: " + getName());
    System.out.println("학교: " + school);
  }

  
  
  
  
  
  
  
  
  
  
  
  
  

  
  
}
