package ex03_Bus;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    Bus bus = new Bus();
    
    bus.getOn(1, new Person("강다혜"));    // 첫 좌석
    bus.getOn(2, new Person("낭다혜"));    // ...
    bus.getOn(3, new Person("당다혜"));    // ...
    bus.getOn(25, new Person("랑다혜"));   // 마지막 좌석
    bus.getOn(25, new Person("망다혜"));   // 오류 메시지 출력
    bus.getOn(30, new Person("방다혜"));   // 오류 메시지 출력

    bus.getOff(1);
    bus.getOff(10); // 오류 메시지 출력
    bus.getOff(30); // 오류 메시지 출력
    bus.getOn(1, new Person("강다혜"));
    bus.info();
    
  }

}
