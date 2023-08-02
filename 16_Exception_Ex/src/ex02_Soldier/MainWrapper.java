package ex02_Soldier;

public class MainWrapper {

  public static void main(String[] args) throws RuntimeException {  // main이 예외를 던지면 Java가 예외처리함
    Gun gun = new Gun(30);          // 30발 담긴 총 생성
    Soldier s = new Soldier(gun);   // 총을만들어서 군인한테 총을 줌
//    Soldier s = new Soldier(30);    // 군인한테 총알을 30발줌
    try {
      s.reload(0);   // 30발 재장전이 불가능 현재 잔여 탄환: 30.
      s.reload(20);   // 재장전완료 현재 탄환: 50
      
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    for(int n = 0; n < 50; n++) {
      s.shoot();
    }
    
  }
  
}
