package ex01_branch;

public class MainWrapper {
  public static void ex01() {
    //점수에 따른 학점(if문)
    int score = 63;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    
//    if(score >= 90) {
//      grade = 'A';
//      System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
//    } else if(score >= 80) {
//      grade = 'B';
//      System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
//    } else if(score >= 70) {
//      grade = 'C';
//      System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
//    } else if(score >= 60) {
//      grade = 'D';
//      System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
//    } else {
//      grade = 'F';
//      System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
//    }
    
    if(score >= 90) {
      grade = 'A';
    } else if(score >= 80) {
      grade = 'B';
    } else if(score >= 70) {
      grade = 'C';
    } else if(score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
  }
  
  public static void ex02() {
    //점수에 따른 학점(switch문)
    int score = 100;
    char grade;  // 'A', 'B', 'C', 'D', 'F'
    
    switch(score / 10) {
    case 10 : grade = 'A';
        break;
    case  9 : grade = 'B';
        break;
    case  8 : grade = 'C';
        break;
    case  7 : grade = 'D';
        break;
    default :
      grade = 'F';
    } System.out.println("점수는 " + score + "점, 성적은 " + grade + "입니다.");
  }
  
  public static void ex03() {
    //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 100; // 점수
    int scYear = 1;  // 학년
    String pass;  // "합격", "불합격"
    
    if ((scYear >= 1 && scYear <= 3 && score >= 60) || (scYear >= 4 && scYear <= 6 && score >= 70)) {
      pass = "합격";
    } else {
      pass = "불합격";
    }
    System.out.println(scYear + "학년 "+ score + "점 " + pass + "입니다.");
  }
    
  public static void ex04() {
    
    //메뉴에 따른 가격
    //아메리카노 : 2000
    //카페라떼 : 2500
    //밀크티 : 3000
    //기타 : 5000
    String order = "카페라떼";
    int price;
    
    switch(order) {
      case "아메리카노":
        price = 2000;
        break;
      case "카페라떼":
        price = 2500;
        break;
      case "밀크티":
        price = 3000;
        break;
      default:
        price = 5000;
    }
    System.out.println("시키신 메뉴는 "+ order + " 가격은 " + price + "원 입니다.");
  }
  
  public static void ex05() {
    //월에 따른 계절
    //3 ~ 5 : 봄
    //6 ~ 8 : 여름
    //9 ~ 11: 가을
    //12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    if(month >= 3 && month <= 5) {
      season = "봄";
    } else if(month >= 6 && month <= 8) {
      season = "여름";
    } else if(month >= 9 && month <= 11) {
      season = "가을";
    } else {
      season = "여름";
    }
    System.out.println("지금은 " + month + "월이고 계절은 " + season + "입니다.");  
  }
  
  public static void ex06() {
    //월에 따른 분기
    //1 ~ 3 : 1분기
    //4 ~ 6 : 2분기
    //7 ~ 9 : 3분기
    //10 ~ 12 : 4분기
    int m = 7;
    String quarter;  
    if(m >= 1 && m <= 3) {
      quarter = "1분기";
    } else if(m >= 4 && m <= 6) {
      quarter = "2분기";
    } else if(m >= 7 && m <= 9) {
      quarter = "3분기";
    } else {
      quarter = "4분기";
    }
  System.out.println("지금은 " + m + "월이고 " + quarter + "입니다.");  
  }
  
  public static void ex07() {
    //10일 후 요일은?
    int day = 14;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일"
    switch((day + nDay) % 7) {
      case 0: weekname = "금"; break;
      case 1: weekname = "토"; break;
      case 2: weekname = "일"; break;
      case 3: weekname = "월"; break;
      case 4: weekname = "화"; break;
      case 5: weekname = "수"; break;
      default: weekname = "목";
    }
    System.out.println("오늘은 " + day + "일이고 " + nDay + "일 후에는 " + weekname + "요일 입니다.");
  }

  public static void ex08() {
    // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
    char ch1 = 'B';  // 임의의 대문자 또는 소문자
    char ch2 = (char) (ch1 + 32);
    System.out.println("대문자는 " + ch1 + "이고 소문자는 " + ch2 + "이다.");
  }
  
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
//    ex05();
//    ex06();
//    ex07();
//    ex08();
  }

}