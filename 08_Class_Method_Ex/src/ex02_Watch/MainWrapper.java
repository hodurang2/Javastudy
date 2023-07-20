package ex02_Watch;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Watch 객체 선언 & 생성
    Watch watch = new Watch();

    // watch 객체에 시, 분, 초 정보 설정하기
    watch.setHour(9);
    watch.setMinute(40);
    watch.setSecond(30);

    int hour = watch.getHour();
    int minute = watch.getMinute();
    int second = watch.getSecond();
    
    // watch 객체에 시, 분, 초 증가시키기
    watch.addHour(25);        // 1일 1시간
    watch.addMinute(61);      // 1시간 1분
    watch.addSecond(3661);    // 1시간 1분 1초
    
    // watch 객체 시, 분, 초 정보 반환
    int addhour = watch.getHour();
    int addminute = watch.getMinute();
    int addsecond = watch.getSecond();    
    System.out.println("현재 시간\n" + hour + "시 " + minute + "분 " + second + "초 에서");
    System.out.println("\n증가한 시간은\n" + addhour + "시 " + addminute + "분 " + addsecond +"초 입니다.");
//    34 시간 -> 9 + 25 -> 34 % 24 -> 10 + 1 시간 + 1시간
//    1시간 40분 -> 40 + 61 -> 101 % 60 ->  41분 + 1분 +1 분
//    1시간 1분 31초 -> 31 + 3660 -> 3691 % 60 -> 31초
//    결과 12시간 42분 31초
  }

}
