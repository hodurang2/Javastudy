package ex02_Soldier;

public class Gun {
  
  private int bullet;
  private final int MAX_BULLET = 50;
  
  public Gun(int bullet) {
    this.bullet = bullet > MAX_BULLET ? MAX_BULLET : bullet;
  }
  
  public void reload(int bullet) throws RuntimeException {
    if(bullet == 0) {
      throw new RuntimeException("이 새꺄 전쟁이 장난이야!!!!!!!!!!!!!!!");
    }
    if(this.bullet == MAX_BULLET || this.bullet + bullet > MAX_BULLET) {
      throw new RuntimeException(bullet + "발 재장전 불가능 \n최대 장전 가능 탄환: " + MAX_BULLET + "\n현재 잔여 탄환: " + this.bullet);
    }
    this.bullet += bullet;
    System.out.println("재장전 완료 \n현재 탄환: " + this.bullet);
  }
  
  public void shoot() {
    if(bullet == 0) {
      System.out.println("틱 총알이 다 떨어졌습니다.");
      return;
    }
    bullet--;
    System.out.println("탕 잔여 탄환: " + bullet);
  }

}
