package ex02_Computer;

public class MainWrapper {

  public static void main(String[] args) {
    
    Notebook notebook = new Notebook("gram", 70);
    System.out.println("모델명: " + notebook.getModel()); // gram
    System.out.println("배터리용량: " + notebook.getBattery()); // 70
  }

}
