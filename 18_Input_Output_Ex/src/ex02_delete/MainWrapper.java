package ex02_delete;

import java.io.File;

public class MainWrapper {

  public static void ex01() {
    new File("C:/2023/08/03/15").delete();
    new File("C:/2023/08/03").delete();
    new File("C:/2023/08").delete();
    new File("C:/2023").delete();
  }
  
  public static void ex02() {
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    for(int i = 0; i < files.length; i++) {
      File file = files[i];
      file.delete();
    }
    dir.delete();
  }
  
  public static void main(String[] args) {
//    ex01();
    ex02();
    
  }

}
