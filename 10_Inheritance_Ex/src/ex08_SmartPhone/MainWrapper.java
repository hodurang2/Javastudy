package ex08_SmartPhone;

// 인터페이스는 다중 구현이 가능하다.
// 클래스 상속과 인터페이스 구현을 동시에 할 수 있다. (상속 먼저, 구현 나중)

public class MainWrapper {

  public static void main(String[] args) {
    
    Phone p = new SmartPhone();
    p.call();
    p.sns();
    if(p instanceof Computer) {
      ((Computer) p).internet();
      ((Computer) p).game();    
    }
    if(p instanceof Camera) {
      ((Camera) p).takePicture();
    }
    
    System.out.println( " =============");
    Computer c = new SmartPhone();
    if(c instanceof Phone) {
      ((Phone)c).call();
      ((Phone)c).sns();
    }
    c.internet();
    c.game();
    if(c instanceof Camera) {
      ((Camera) c).takePicture();
    }
    
    
    System.out.println( " =============");
    SmartPhone sp = new SmartPhone();
    sp.call();
    sp.sns();
    sp.internet();
    sp.game();
    sp.takePicture();
  }

}
