package ex06_GameUnit;

public abstract class GameUnit {
  
  private String name;
  private int hp;
  private boolean alive;
  
  public GameUnit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
    setAlive(this.hp > 0);
  }

  public boolean isAlive() {
    return alive;
  }
  private void setAlive(boolean alive) {
    this.alive = alive;
  }
  
  public abstract void attack(GameUnit unit);
  
  
}
