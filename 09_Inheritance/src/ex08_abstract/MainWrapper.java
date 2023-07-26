package ex08_abstract;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 추상클래스 Peroson은 객채를 생성할 수 없다,
//    Person p1 = new Person();  
//    p1.eat();
//    p1.sleep();
    
    Person p2 = new Student();
    p2.eat();
    p2.sleep();
    p2.study();
    
  }

}
