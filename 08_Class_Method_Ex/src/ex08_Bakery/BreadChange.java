package ex08_Bakery;

public class BreadChange {
  
  private int bread;       // 판매한 빵이 몇 개인가?
  private int change;      // 잔돈이 얼마인가?
  
  public BreadChange(int bread, int change) {
    this.bread = bread;
    this.change = change;
  }

  // Setter 메소드
  public void setBread(int bread) {
    this.bread = bread;
  }
  public void setChange(int change) {
    this.change = change;
  }
  
  // Getter 메소드
  public int getBread() {
    return bread;
  }
  public int getChange() {
    return change;
  }
  
  
}
