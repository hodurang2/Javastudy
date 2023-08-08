package ex01_web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.management.RuntimeErrorException;

public class Ex04_Text_Reader {

  public static void main(String[] args) {
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader reader = null;
    BufferedWriter writer = null;
    
    try {
      // 웹상의 텍스트 파일 읽기 (XML)
      String spec = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "기상일보.xml");
      
      writer = new BufferedWriter(new FileWriter(file));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = reader.readLine()) != null) {
        writer.write(line + "\n");
      }
      
      System.out.println( file.getPath() + "파일 내려받기 성공");
      
    } catch (MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(writer != null) writer.close();
        if(reader != null) reader.close();
        if(con != null) con.disconnect();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    
    
    
  }

}
