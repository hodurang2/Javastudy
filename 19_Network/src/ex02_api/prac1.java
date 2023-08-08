package ex02_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class prac1 {

  public static void main(String[] args) {
    /*
     * 한국환경공단 에어코리아 대기오염정보 - 시도별 실시간 측정정보 조회
     * 1. 요청주소 : http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
     * 2. 요청변수(Request Parameter)
     *    1) serviceKey : 필수, 인코딩된 인증키
     *    2) returnType : 선택, xml 또는 json
     *    3) numOfrows  : 선택, 100
     *    4) pageNo     : 선택, 1
     *    5) sidoName   : 필수, 서울
     *    6) ver        : 선택, 1.0
     */
    
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
      
      String spec = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
      String serviceKey = "8O9HjHrrdw8cD4Bt2t48+/xPYJw56POvSft+OcjnRxM4qsbUMP/1TLUAthIN0sMJreo0oIx09NH5YwTGnbqY3Q==";
      String returnType = "xml";
      String numOfRows = "100";
      String pageNo = "1";
      String sidoName = "서울";
      String ver = "1.0";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
      sb.append("&returnType=").append(URLEncoder.encode(returnType, "UTF-8"));
      sb.append("&numOfRows=").append(URLEncoder.encode(numOfRows, "UTF-8"));
      sb.append("&pageNo=").append(URLEncoder.encode(pageNo, "UTF-8"));
      sb.append("&sidoName=").append(URLEncoder.encode(sidoName, "UTF-8"));
      sb.append("&ver=").append(URLEncoder.encode(ver, "UTF-8"));
      
      url = new URL(sb.toString());
      con = (HttpURLConnection) url.openConnection();
      int responsecode = con.getResponseCode();
      if(responsecode == HttpURLConnection.HTTP_OK) {
        
      }
      
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      
    }
    
    
  }

}
