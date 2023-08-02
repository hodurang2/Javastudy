package ex02_String;

import java.util.Scanner;

public class MainWrapper {

  // 문제1. 다음 주소를 아래와 같이 분석하여 분리하시오.
  // String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
  // String requestURI = "https://comic.naver.com/webtoon/detail";  // 물음표(?) 이전 문자열만 추출
  // String param = "titleId=758037&no=112&weekday=mon";            // 물음표(?) 이후 문자열만 추출
  public static void ex01() {
    String url = "https://comic.naver.com/webtoon/detail?titleId=758037&no=112&weekday=mon";
    String requestURI = "";
    String param = "";
    
    requestURI = url.substring(0, url.indexOf("?"));
    param = url.substring(url.indexOf("?") + 1);
    System.out.println("requestURI: " + requestURI+ param);
    System.out.println("param: " + param);
  }

  // 문제2. 다음 파일명을 분석하여 파일명과 확장자를 분리하시오.
  // String fullName = "apple.jpg";
  // String fileName = "apple";
  // String extName = "jpg";
  public static void ex02() {
    String fullName = "apple.jpg";
    String fileName = "";
    String extName = "";
    
    fileName = fullName.substring(0, fullName.indexOf("."));
    extName = fullName.substring(fullName.indexOf(".") + 1);
    System.out.println("fileName: " + fileName);
    System.out.println("extName: " + extName);
  }

  // 문제3. 다음 기준에 따라서 파일명을 변환하시오.
  // 사용자로부터 공백이 포함되어 있지 않은 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
  // 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
  // 실행예시)
  // 변환 전 파일명 >>> happy.jpg
  // 변환 후 파일명 = happy_1658792128410.jpg
  public static void ex03() {
    String beforeName = "";  // 변환 전 파일명
    String afterName = "";   // 변환 후 파일명
    long timestamp = System.currentTimeMillis();
    
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    beforeName = sc.next();
    
    sb.append(beforeName.substring(0, beforeName.indexOf(".")));
    sb.append(timestamp);
    sb.append(beforeName.substring(beforeName.indexOf(".") + 1));
    
    afterName = sb.toString();
    System.out.println("beforeName: " + beforeName);
    System.out.println("afterName: " + afterName);
  }
  
  // 문제4. 주어진 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
  // 나이 : 현재년도 - 태어난년도 (생일이 지났는지 여부는 따지지 않습니다.)
  // 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
  // 실행예시)
  // 9살 남자입니다.
  public static void ex04() {
    String personalId = "141212-3345678";
    
    int born = Integer.parseInt(personalId.substring(0, 2));
    if(born < 23) { born += 2000;} else { born += 1900;}
    int age = 2023 - born;
    
    String year = personalId.substring(personalId.indexOf("-") + 1, personalId.indexOf("-")+2);
    
    if(year.equals("1") || year.equals("3")) {
      System.out.println(age + "살 남자입니다.");
    } else {
      System.out.println(age + "살 여자입니다.");
    }
  }
  
  // 문제5. 사용자로부터 입력 받은 문자열을 거꾸로 읽어도 원래 문자열과 동일한지 여부를 파악하는 프로그램을 구현하시오.
  // 실행예시1)
  //   문자열 입력 >>> 메롱
  //   메롱 : 거꾸로 읽으면 메롱과 다릅니다.
  // 실행예시2)
  //   문자열 입력 >>> 역삼역
  //   역삼역 : 거꾸로 읽어도 역삼역입니다.
  public static void ex05() {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    String str = sc.next();
    
    
    for(int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }
    
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
    ex05();
  }

}