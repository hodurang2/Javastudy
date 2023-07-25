package ex06_GameUnit;

public class MainWrapper {

  public static void main(String[] args) {
    
    GameUnit unit1 = new Marine("마린");
    GameUnit unit2 = new Firebat("파뱃");
    
    // 초기 체력 설정
    unit1.setHp(100);
    unit2.setHp(50);

    
    // 공격 순서를 결정하는 flag
    boolean myTurn = true;
    
    // 게임 유닛이 모두 살아있으면 계속해서 공격
    while(unit1.isAlive() && unit2.isAlive()) {
      if(myTurn) {
        unit1.attack(unit2);
//        System.out.println("남은 체력: " + unit2.getHp());
      } else {
        unit2.attack(unit1);
//        System.out.println("남은 체력: " + unit1.getHp());
      }
      myTurn = !myTurn;
    }
    
    System.out.println("=== 게임 종료 ===");
    
    // 승리한 게임 유닛 확인
    if(unit1.isAlive()) {
      System.out.println(unit1.getName() + "의 승리! 현재 HP = " + unit1.getHp());
    } else {
      System.out.println(unit2.getName() + "의 승리! 현재 HP = " + unit2.getHp());
    }
    
  }

}
