package ex05_upcasting;

public class MainWrapper {

  public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.setName("정찬호");
    s1.setSchool("수원대학교");
    s1.eat();
    s1.sleep();
    s1.study();
    System.out.println(s1.getName());
    System.out.println(s1.getSchool());
    
    Student s2 = new Student("강다혜", "세종대학교");
    s2.eat();
    s2.sleep();
    s2.study();
    System.out.println(s2.getName());
    System.out.println(s2.getSchool());
    
    
  }

}
