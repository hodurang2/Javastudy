package ex04_text_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "alphabet.txt");
    
    BufferedOutputStream bout = null;
    
    try {
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      for(int word = 'A'; word <= 'Z'; word++) {
        bout.write(word);
      }
      
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) bout.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    File dir = new File("C:/storage");
    File originFile = new File(dir, "alphabet.txt");
    File copyFile = new File(dir, "alphabet2.txt");
    
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
      
      br = new BufferedReader(new FileReader(originFile));
      bw = new BufferedWriter(new FileWriter(copyFile));
      
      String line = null;
      while((line = br.readLine()) != null) {
        bw.write(line);
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bw != null) bw.close();
        if(br != null) br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}