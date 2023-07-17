package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 18
    int dan = 2;  // 이 곳에 원하는 구구단을 넣으면 된다.
    for(int i = 1; i <= 9; i++) {
      System.out.println(dan + " x " + i + " = " + i*dan);
    }
  }
  
  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    int goal = 100000;  // 목표 모금액
    int money = 60;  // 1회당 모금액
    int total = 0;  // 모금액 합계
    int nth = 0;  // 회차
    while(total < goal) {
      nth++;
      System.out.println(nth + "회 모금액 " + money + "원, 현재 모금액 " + (total+money) + "원");
      total += money;
    }
    
    for(; total < goal;) {
      nth++;
      System.out.println(nth + "회 모금액 " + money + "원, 현재 모금액 " + (total+money) + "원");
      total += money;
    }
    
  }
  
  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81
    for(int i = 1; i <= 9; i++) {
      System.out.println(i + "단");
      for(int j = 1; j <= 9; j++) {
        System.out.println(i + "x" + j + "=" + i*j);
      }
      System.out.println("");
    }
  }
  
  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2  3x1=3  4x1=4  ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81
    
    // 참고할코드
    // 2x1=2를 출력한 뒤 줄을 바꾸지 않는다.
    for(int i = 1; i <= 9; i++) {
      System.out.println(i + "단");
      for(int j = 1; j <= 9; j++) {
        String result = String.format("%-4d", i*j);
        System.out.print(i + "x" + j + "=" + result);
      }
      System.out.println("\n");
    }    
  }
  
  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    // *
    // **
    // ***
    // ****
    // *****
    
    // 참고할 코드
    // System.out.print("*");  // *를 출력한 뒤 줄을 바꾸지 않는다.
    // System.out.println();   // 줄 바꾸기

//
    int n = 5; // 삼각별 단계 지정해주는 파라미터
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i >= j) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    for(int row = 1; row <= n; row ++) {
      for(int star = 1; star <= row; star ++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
  }
  
  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    // *****
    // ****
    // ***
    // **
    // *
    System.out.println();
    // 내가한것 
    int n = 5; // 삼각별 단계 지정해주는 파라미터
    for(int i = n; i >= 0; i--) {
      for(int j = 0; j < n; j++) {
        if(i > j) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    // 교수님이 하신것
    for(int row = 1; row <= 5; row++) {
      for(int star = 1; star <= 6 - row; star ++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
    
  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    
    int n = 5; // 삼각별 단계 지정해주는 파라미터
    // 내가한 것
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n-i-1; j++) {
        System.out.print(" ");
      }
      for(int q = 0; q < 2*n-2*(n-i)+1; q++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    // 강사님이 한 것
    System.out.println();
    for(int row = 1; row <= 5; row++) {
      for(int space = 1; space <= n - row; space++) {
        System.out.print(" ");
      }
      for(int star = 6-row; star <= row + 4; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
  
  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    System.out.println();
    int level = 5; // 삼각별 단계 지정해주는 파라미터
    
    for(int row = 0; row < level; row++) {
      for(int space = level; space > level-row; space--) {
        System.out.print(" ");
      }
      for(int star = 0; star <= 2*(level-(row+1)); star++) {
        System.out.print("*");
      }
      System.out.println();
    }

    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
    ex07();
    ex08();
  }
  
}