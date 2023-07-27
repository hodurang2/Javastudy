package exo3_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  
  private List<Seat> seats;
  private final int LIMIT = 25; // 25인
  
  public Bus() {
    seats = new ArrayList<Seat>(LIMIT);
    for(int cnt = 0; cnt < LIMIT; cnt++) {
      seats.add(new Seat());
    }
  }
  
  
  public void getOn(Integer seatNo, Person person) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println(seatNo + "번 좌석은 존재 하지 않는 좌석 입니다.");
      return;
    } 
    if(seats.get(seatNo - 1).getPerson() != null) {
      System.out.println(seatNo + "번 좌석은 이미 " + seats.get(seatNo-1).getPerson() + " 승차한 좌석입니다.");
      return;
    }
    seats.get(seatNo - 1).setPerson(person);
    System.out.println(seatNo + "번 좌석에 " + person + "승차 했습니다.");
  }

  public void getOff(int seatNo) {
    if(seatNo < 1 || seatNo > LIMIT) {
      System.out.println(seatNo + "번 좌석은 존재하지 않는 좌석 입니다.");
      return;
    } 
    if(seats.get(seatNo - 1).getPerson() == null) {
      System.out.println(seatNo + "번 좌석은 이미 빈자리 입니다.");
      return;
    }
    System.out.println(seatNo + "번 승객 " + seats.get(seatNo-1).getPerson() + "하차 했습니다.");
//    seats.get(seatNo - 1).setPerson(null);
    System.out.println("하차한사람: " + seats.remove(seatNo-1).getPerson());
//    seats.remove(seatNo - 1);
  }
  
  public void info() {
    for(int i = 0; i < LIMIT; i++) {
      if(seats.get(i).getPerson() != null) {
        System.out.println(i+1 + "번 좌석: " + seats.get(i).getPerson());              
      } else {
        System.out.println("빈 좌석");
      }
    }
  }
  
  
}
