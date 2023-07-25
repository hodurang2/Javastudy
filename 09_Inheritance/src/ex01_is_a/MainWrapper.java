package ex01_is_a;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Student 객체 선언 & 생성
    Student student = new Student();
    
    // Student 객체 메소드 확인
    student.eat();    // 슈퍼클래스로 부터 상속 받은 메소드
    student.sleep();  // 슈퍼클래스로 부터 상속 받은 메소드
    student.study();  // student의 메소드
    
  }

}
