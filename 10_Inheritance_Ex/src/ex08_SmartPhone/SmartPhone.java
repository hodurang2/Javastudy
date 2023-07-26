package ex08_SmartPhone;

public class SmartPhone extends Camera implements Phone, Computer {

  @Override
  public void game() {
    System.out.println("게임");
  }

  @Override
  public void internet() {
    System.out.println("인터넷");
  }

  @Override
  public void call() {
    System.out.println("전화");
  }

  @Override
  public void sns() {
    System.out.println("문자");
  }

}
