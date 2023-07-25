package ex02_has_a;

public class Remocon {
  
  private int ch;  // 0 ~ MAX_CH
  private int vol = 0; // 0 ~ MAX_VOL 
  private final int MAX_CH = 99;
  private final int MAX_VOL = 10;
  
  public void upCh() {
    if(ch == MAX_CH) {
      ch = 0;
      return;
    }
    ch++;      
  }
  public void downCh() {
    if(ch == 0) {
      ch = MAX_CH;
      return;
    } 
    ch--;
  }
  public void upVol() {
    if(vol == MAX_VOL) {
      System.out.println("최대 볼륨입니다.");
      return;
    }
    vol++;
  }
  public void downVol() {
    if(vol == 0) {
      System.out.println("볼륨X");
      return;
    }
    vol--;
  }
  
  public int getCh() {
    return ch;
  }
  public void setCh(int ch) {
    this.ch = ch;
  }
  public int getVol() {
    return vol;
  }
  public void setVol(int vol) {
    this.vol = vol;
  }
  
  
  
  
  
}
