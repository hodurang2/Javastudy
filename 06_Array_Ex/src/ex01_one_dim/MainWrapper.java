package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {

  public static void ex01() {
    // 월에 따른 계절    월 % 12
    // 3 ~ 5 : 봄        3 ~ 5
    // 6 ~ 8 : 여름      6 ~ 8
    // 9 ~ 11: 가을      9 ~ 11
    // 12 ~ 2: 겨울      0 ~ 2
    int month = 9;
    String[] seasons = {"겨울", "봄", "여름", "가을"};
    // 코드 1줄로 해결할 것
    System.out.println(month + "월은 " + seasons[(month % 12) / 3] + "입니다.\n");
  }
  
  public static void ex02() {
    // 10, 20, 30, 40, 50을 배열 a에 저장하고 출력하기
    // 배열 a: [10, 20, 30, 40, 50]
    int[] a = new int[5];
    // 배열과 인덱스 외 변수 사용 금지
    for(int i = 0; i < a.length; i++) {
      a[i] = 10+10*i;
    }
    System.out.println( "배열 a: " + Arrays.toString(a) + "\n");
  }
 
  public static void ex03() {
    // 'A', 'B', 'C', ...'Z'를 배열 a에 저장하고 출력하기
    // 배열 a: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
    char[] a = new char[26];
    char ch = 'A';
    for(int i = 0; i < a.length; i++) {
      a[i] = ch;
      ch++;
    }
    System.out.println(a);
    System.out.println();
  }
  
  public static void ex04() {
    // 배열 a의 마지막 3개 요소 0을 배열 b의 요소로 바꾸기
    // 배열 a: [10, 20, 30, 40, 50, 60]
    int[] a = {10, 20, 30, 0, 0, 0};
    int[] b = {40, 50, 60};
    for(int i = 0; i < 3; i++) {
      a[i+3] = b[i];
      System.out.println("a의 "+ (i+3) + "번 인덱스와 b의"+ i + "번 인덱스가 같나요? : " + (a[i+3] == b[i]));
    }
    System.out.println("배열 a:"+ Arrays.toString(a));
    System.out.println("배열 b:"+ Arrays.toString(b));
//    System.arraycopy(b, 0, a, 3, b.length);  System.arraycopy를 이용하여 복사하기 array(복사할어레이, 시작인덱스, 복사될배열, 복사가시작될인덱스, 몇개복사할지)
  }
  
  public static void ex05() {
    // 10진수(int number)를 2진수(int[] binary)로 변환하기
    // 10진수 35 = 2진수 0000100011
    int number = 35;             //  35를 2진수로 변환하면 아래와 같다.
    int number1 = number;        // ┌------------------------------------------------┐
    int[] binary = new int[10];  // │ 0 │ 0 │ 0 │ 0 │ 1 │ 0 │ 0 │ 0 │ 1 │ 1 │
                                 // └------------------------------------------------┘
    for(int i = binary.length - 1; i >= 0; i--) {
      binary[i] = number % 2;
      number /= 2;
    }
    System.out.println("\n" + number1 + "를(을) 2진수로 바꾸면" + Arrays.toString(binary) + "입니다.");
  }
  
  public static void ex06() {
    // 배열에 저장된 점수의 평균, 최댓값, 최솟값 구하기
    // 평균: 84.8점
    // 최대: 100점
    // 최소: 70점
    String[] name = {"다혜", "찬호", "엄마", "아빠", "동생"};
    int top = 0;
    int bottom = 0;
    int[] score = {100, 70, 95, 83, 76};
    int total = score[0];  // 합계(평균을 구할 때 필요한 변수)
    int max = score[0];  // 최댓값
    int min = score[0];  // 최솟값
//    for(int grade: score) {
//      total += grade;
//      max = Math.max(max, grade);
//      min = Math.min(min, grade);
//    }
    for(int i = 1; i <score.length; i++) {
      total += score[i];
      if(max < score[i]) {
        max = score[i];
        top = i;
      }
      if(min > score[i]) {
        min = score[i];
        bottom = i;
      }
    }
    System.out.println("\n평균은 " + total / score.length + "입니다.");
    System.out.println("1등은 " + name[top] + "이고 점수는" + max + "입니다.");
    System.out.println("꼴등은 " + name[bottom] + "이고 점수는" + min + "입니다.");    
    System.out.println("최댓값은" + max + "입니다.");
    System.out.println("최솟값은" + min + "입니다.");
  }
  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    ex06();
  }
  
}
