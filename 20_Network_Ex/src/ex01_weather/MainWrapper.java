package ex01_weather;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 1시간마다 갱신되는 전국 날씨 정보
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
    
    // 객체 선언
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    // C:/storage/sfc_web_map.xml 파일로 저장하기
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    // 실행문 (객체생성 등등)
    try {
      
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      
      File file = new File(dir, "sfc_web_map.xml");
      
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      bw = new BufferedWriter(new FileWriter(file));
      
      String line = null;
      StringBuilder sb = new StringBuilder();
      
      while((line = br.readLine()) != null) {
        bw.write(line + "\n");
      }
      System.out.println("파일 생성완료");
      
    } catch(MalformedURLException e) {
      System.out.println("URL 주소 오류");
    } catch(IOException e) {
      System.out.println("URL 접속 오류");
    } finally {
      try {
        // 생성의 역순으로 닫기
        if(bw != null) {bw.close(); }
        if(br != null) { br.close(); }
        if(con != null) { con.disconnect(); }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    
  }

}
