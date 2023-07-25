package ex04_Chair;

public class MainWrapper {

  public static void main(String[] args) {
    
    Chair chair1 = new Chair();
    chair1.setPerson(new Student("정찬호", "수원대학교"));   // upcasting( Student -> Person )진행
    chair1.getPerson().info(); // 이름, 학교 출력
    
    Chair chair2 = new Chair();
    chair2.setPerson(new Alba("강다혜", "세종대학교", "아마스빈"));   // upcasting( Alba -> Person )진행
    chair2.getPerson().info(); // 이름, 학교, 직장 출력
    
    
    
  }

}
