package ex02_has_a;

public class MainWrapper {

  public static void main(String[] args) {

    Tv tv = new Tv();
    System.out.println("채널: " + tv.getCh());
    tv.downCh();
    tv.upCh();
    tv.downVol();
    tv.upVol();
    System.out.println("볼륨: " + tv.getVol());
    System.out.println("채널: " + tv.getCh());

  }

}
