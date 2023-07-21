package ex07_Car;

public class Car {

  private Driver driver;
  private int speed;
  private int fuel;
  private final int MAXSPEED = 100;
  
  // Setter 메소드
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public void setFuel(int fuel) {
    this.fuel = fuel;

  }

  
  // Getter 메소드
  public Driver getDriver() {
    return driver;
  }
  public int getSpeed() {
    return speed;
  }
  public int getFuel() {
    return fuel;
  }

  // 행동 메소드
  public void engineStart() {
    if(fuel == 0) {
      System.out.println("안부릉");
    } else {
      System.out.println("부릉부릉");      
    }
  }
  public void drive() {
    if(fuel == 0 || driver == null) {
      System.out.println("안돼 못가 돌아가");
    } else {
      System.out.println("가보자고~");
    }
  }
  public void accel(int speed) {
    if(fuel == 0) {
      System.out.println("연료가 떨어졌습니다.");
    }
    this.speed += speed;
    if(this.speed > MAXSPEED) {
      this.speed = MAXSPEED;
      fuel -= 2;
      System.out.println("최대속도입니다!! 현재 속도: " + this.speed + "km/h 입니다. 남은 연료: " + fuel);
    } else {
      fuel--;
      System.out.println("현재 속도: " + this.speed + "km/h 입니다. 남은 연료: " + fuel);
    }
  }
  public void brake(int speed) {
    this.speed -= speed;
    if(this.speed <= 0) {
      this.speed = 0;
      System.out.println("끼이익 차가 멈췄습니다. 현재속도: " + this.speed);
    } else {
      System.out.println("속도가 줄었습니다. 현재속도: " + this.speed);      
    }
    
  }
  
}
