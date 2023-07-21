package ex07_Car;

public class MainWrapper {

  public static void main(String[] args) {

    Driver driver = new Driver();

    driver.setName("베르슈타펜");
    driver.setCareer(20);
    
    System.out.println(driver.getName());
    System.out.println(driver.getCareer());
    System.out.println(driver.isBestDriver());
    
    Car myCar = new Car();
    myCar.setDriver(driver);
    myCar.setFuel(50);
    myCar.engineStart();  // 부릉부릉 or 안부릉
    myCar.drive();        // 부릉부릉 or 안부릉
    myCar.accel(30);      // 기존 속도에 50 추가
    myCar.accel(50);      // 기존 속도에 60 추가 (최대 속도 100) 현재속도는 100
    myCar.accel(50);      // 기존 속도에 60 추가 (최대 속도 100) 현재속도는 100
    myCar.brake(30);      // 기존 속도에 30만큼 감속, 현재속도 70
    myCar.brake(30);      // 기존 속도에 30만큼 감속, 현재속도 40
    myCar.brake(50);      // 기존 속도에 50만큼 감속 (최저속도 0), 현재속도 0    
    for(int i = 0; i < 50; i++) {
      myCar.accel(i);
      if(myCar.getFuel() <= 0) {
        break;
      }
    }
  }

}
