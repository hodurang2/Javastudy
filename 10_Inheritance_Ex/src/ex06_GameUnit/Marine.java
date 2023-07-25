package ex06_GameUnit;

public class Marine extends GameUnit {
  
  private final int POWER = 5;
  
  public Marine(String name) {
    super(name);  // public GameUnit(String name){} 생성자 호출
  }
  
  @Override
  public void attack(GameUnit unit) {
    System.out.println(super.getName() + "의 공격!");
    if(POWER >= unit.getHp()) {
      unit.setHp(0);
    } else {
      unit.setHp(unit.getHp() - POWER);
    }
  } 
  
}
