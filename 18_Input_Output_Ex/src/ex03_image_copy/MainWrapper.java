package ex03_image_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainWrapper {
  
  
  public static void main(String[] args) {
    
    // 문제. %ORA_HOME/oui/instImages/bg.jpg 이미지 파일을 C:/storage/bg.jpg 이미지로 복사한다.
    // %ORA_HOME%은 C:/app/GOODEE/product/18.0.0/dbhomeXE를 의미한다.
    
    BufferedInputStream bin = null;
    BufferedOutputStream bout = null;
    
    File originDir = new File("C:\\app\\cchc0\\product\\18.0.0\\dbhomeXE\\oui\\instImages");
    File originFile = new File(originDir, "bg.jpg");

    File copyDir = new File("C:/storage");
    File copyFile = new File(copyDir, originFile.getName());
    
    try {
      
      bin = new BufferedInputStream(new FileInputStream(originFile));
      bout = new BufferedOutputStream(new FileOutputStream(copyFile));
      
      byte[] b = new byte[1024];
      int readByte = 0;
      
      while((readByte = bin.read(b)) != -1) {
        bout.write(b, 0, readByte);
      }
      System.out.println(originFile.getPath() + " -> " + copyFile.getPath());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
        if(bin != null) bin.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
    
  }
}
