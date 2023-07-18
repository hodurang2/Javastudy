package ex02_two_dim;

public class MainWrapper {
  
  /*
   * 2차원 배열
   * 1. 1차원 배열이 2개 이상 모인 자료 구조이다.
   * 2. 행과 열의 집합인 테이블 구조로 이해하면 쉽다.
   * 3. 
   * 4. 
   */
  
  public static void ex01() {
    
    // 2차원 배열의 선언
    int[][] a;
    
    // 2차원 배열의 생성
    a = new int[3][2];    // 3행 2열 구조의 2차원 배열 생성
    
    // 테이블 형태로 2차원 배열 출력
    System.out.println(a[0][0] + " " + a[0][1]);  // 첫 번째 행(첫 번째 1차원 배열)
    System.out.println(a[1][0] + " " + a[1][1]);  // 두 번째 행(두 번째 1차원 배열)
    System.out.println(a[2][0] + " " + a[2][1]);  // ㅛㅔ 번째 행(세 번째 1차원 배열)
  }
  
  public static void ex02() {
    
    // 2차원 배열의 선언 & 생성
    int[][] a = new int[3][2];
    
    // 각 요소를 4자리 고정 폭으로 출력
    System.out.print(String.format("%4d", a[0][0]));
    System.out.print(String.format("%4d", a[0][1]));
    System.out.println();
    
    System.out.print(String.format("%2d", a[1][0]));
    System.out.print(String.format("%4d", a[1][1]));
    System.out.println();

    System.out.print(String.format("%3d", a[2][0]));
    System.out.print(String.format("%4d", a[2][1]));
    System.out.println();
    
  }
  
  public static void ex03() {
    
    // 2차원 배열 선언 & 생성
    int[][] a = new int[3][2];
    
    // 인덱스 : row, col
    // 
    
    for(int row = 0; row < a.length; row++) {
      for(int col = 0; col < a[row].length; col++) {
        String result = String.format("%4d", a[row][col]);
        System.out.print(result);
      }
      System.out.println();
    }
  }
  
  /*
   * 2차원 배열의 초기화
   * int[][] a = {
   *   {10, 20},
   *   {30, 40},
   *   {50, 60}
   * };
   */
  public static void ex04() {
    
    int[][] a = {
      {10, 20},
      {30, 40},
      {50, 60}
    };
    
    // 2중 for문
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 2; j++) {
        String res = String.format("%4d", a[i][j]);
        System.out.print(res);
      }
      System.out.println();
    }
    
  }
  
  /*
   * 2차원 배열의 구조
   * int[][] a = {
   *   {10, 20},
   *   {30, 40},
   *   {50, 60}
   * };
   * 
   *     ┌--------------┐
   *    a│  0x10000000  │----┐
   *     │--------------│    │ a.length == 3
   *     │     ...      │    │
   *     ┌--------------┐    ▼
   *     │              │0x10000000
   * a[0]│  0xA0000000  │----┐
   *     │              │    │    
   *     │--------------│    │a[0].length == 2
   *     │              │    │
   * a[1]│  0xB0000000  │----│------┐
   *     │              │    │      │
   *     │--------------│    │      │a[1].length == 2
   *     │              │    │      │
   * a[2]│  0xC0000000  │----│------│------┐
   *     │              │    │      │      │
   *     └--------------┘    │      │      │a[2].length == 2
   *     │     ...      │    │      │      │
   *     ┌--------------┐    ▼      │      │
   *     │      10      │0xA0000000  │      │
   *     │--------------│            │      │
   *     │      20      │0xA0000004  │      │
   *     └--------------┘            │      │
   *     │     ...      │            │      │
   *     ┌--------------┐            │      │
   *     │      30      │0xB0000000◀┘      │
   *     │--------------│                    │
   *     │      40      │0xB0000004          │
   *     └--------------┘                    │
   *     │     ...      │                    │
   *     ┌--------------┐                    │
   *     │      50      │0xC0000000◀--------┘
   *     │--------------│
   *     │      60      │0xC0000004
   *     └--------------┘
   *     │     ...      │
   *     │              │
   *     └--------------┘
   */
  
  public static void ex05() {
    
    // 2차원 배열 초기화
    int[][] a= {
        {10, 20},
        {30, 40},
        {50, 60}
    };
    
    // 2차원 배열의 2중 for문 최종 버전
    for(int row = 0; row < a.length; row++) {
      for(int col = 0; col < a[row].length; col++) {
        String result = String.format("%4d", a[row][col]);
        System.out.print(result);
      }
      System.out.println();
    }
  }
  
  public static void ex06() {
    
    // 모든 열의 갯수가 동일할 필요는 없다.
    
    // 2차원 배열 초기화
    int[][] a = {
        {10},
        {20, 30},
        {40, 50, 60}
    };
    
    for(int row = 0; row < a.length; row++) {
      for(int col = 0; col < a[row].length; col++) {
        String result = String.format("%4d", a[row][col]);
        System.out.print(result);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
    ex06();
  }

}