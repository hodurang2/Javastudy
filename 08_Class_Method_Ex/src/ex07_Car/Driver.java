package ex07_Car;

public class Driver {

  private String name;
  private int career;
  private boolean bestDriver;  // 기준 career가 10년 이상이면 true
  int bestLimit = 10;
  
  // Setter 메소드
  public void setName(String name) {
    this.name = name;
  }
  public void setCareer(int career) {
    this.career = career;
    setBestDriver();
  }
  private void setBestDriver() {
    bestDriver = career > bestLimit;
  }
  
  // Getter 메소드
  public String getName() {
    return name;
  }
  public int getCareer() {
    return career;
  }
  public boolean isBestDriver() {
    return bestDriver;
  }
  
  
}
