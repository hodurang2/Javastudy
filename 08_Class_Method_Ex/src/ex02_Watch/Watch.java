package ex02_Watch;

/**
 * 시, 분, 초 정보를 가지고 있는 시계 클래스
 * addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조각할 수 있다.
 * @author HoduRang2
 * @since 2023.07.20
 * @version 1.0.0
 *
 */

public class Watch {
  
  // 필드
  /**
   * 시간 정보를 저장하는 필드로 0 ~ 23 사이 값을 가진다.
   */
  private int hour;
  /**
   * 분 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int minute;
  /**
   * 초 정보를 저장하는 필드로 0 ~ 59 사이 값을 가진다.
   */
  private int second;
  
  // set 필드 메소드
  public void setHour(int hour) {
    this.hour = hour;
  }
  public void setMinute(int minute) {
    this.minute = minute;
  }
  public void setSecond(int second) {
    this.second = second;
  }
  
  // get 필드 메소드
  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }
  public int getSecond() {
    return second;
  }
  
  /**
   * 필드 hour에 파라미터 param을 더하는 메소드<br>
   * 필드 hour값은 0 ~ 23 사이의 값을 가질 수 있도록 유지해야 한다.
   * @param 증가시킬 시간 정보 (0보다 작거나 같으면 처리하지 않는다.
   */
  public void addHour(int param) {
    if(param <= 0) {
      return;
    }
    hour += param; 
    hour %= 24;
  }
  
  /**
   * 필드 minute에 파라미터 param을 더하는 메소드<br>
   * 필드 minute값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 minute값이 60보다 크거나 같으면 필드 hour값도 증가시켜야 한다.<br>
   * @param 증가시킬 분 정도
   */
  public void addMinute(int param) {
    if(param <= 0) {
      return;
    } 
    minute += param;
    if(minute >= 60) {
      addHour(minute / 60);
    }
    minute %= 60; 
  }
  
  /**
   * 필드 Second에 파라미터 param을 더하는 메소드<br>
   * 필드 Second값은 0 ~ 59 사이의 값을 가질 수 있도록 처리해야 한다.<br>
   * 필드 Second값이 60보다 크거나 같으면 필드 hour값도 증가시켜야 한다.<br>
   * @param 증가시킬 초 정도
   */
  public void addSecond(int param) {
    if(param <= 0) {
      return;
    }
    second += param;
    if(second >= 60) {
      addMinute(second / 60);
    }
    second %= 60; 
  }
  
}
