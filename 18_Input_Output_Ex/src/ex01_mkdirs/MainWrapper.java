package ex01_mkdirs;

import java.io.File;
import java.time.LocalDateTime;

public class MainWrapper {

  public static void main(String[] args) {
    
    LocalDateTime dateTime = LocalDateTime.now();
    // 날짜/시간 구성요소 가져오기
    int year = dateTime.getYear();          // 년
    int month = dateTime.getMonthValue();   // 월(1~12)
    int day = dateTime.getDayOfMonth();     // 일
    int hour = dateTime.getHour();          // 시(0~23)
    
    // 현재 날짜와 시간을 이용하여 디렉토리를 만드시오.
    // C:/2023/08/03/14
    StringBuilder sb = new StringBuilder();
    sb.append("C:");
    sb.append("/");
    sb.append(year);
    sb.append("/");
    sb.append(String.format("%02d", month));
    sb.append("/");
    sb.append(String.format("%02d", day));
    sb.append("/");
    sb.append(String.format("%02d", hour));
    
    File dir = new File(sb.toString());
    if(!dir.exists()) {
      dir.mkdirs();
    }
    System.out.println(dir.getPath() + " 디렉토리 생성 완료");
    
  }

}
