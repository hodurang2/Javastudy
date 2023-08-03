package ex03_random;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class MainWrapper {

  // 문제1. 주사위 3개 던지기.
  // 주사위 3개를 동시에 던져서 나오는 상황을 연출하시오. Random 클래스를 활용하시오.
  // 실행예시)
  // 주사위: [3, 1, 5]
  public static void ex01() {
    int[] dice = new int[3];
    Random dice1 = new Random();
    
    dice[0] = dice1.nextInt(5) + 1;
    dice[1] = dice1.nextInt(5) + 1;
    dice[2] = dice1.nextInt(5) + 1;
    
    System.out.println("[" + dice[0] + ", " + dice[1] + ", " + dice[2] + "]");
  }
  
  // 문제2. 통장(balance)에 최초 5000원이 있다.
  // 1원부터 통장 잔고 사이의 난수를 발생시켜서 해당 난수만큼 출금 처리하시오.
  // 더 이상 출금이 불가능한 상황이면 출금을 멈추시오.
  // 실행예시)
  // 출금 전 5000원, 1회 출금액 2917원, 출금 후 2083원
  // 출금 전 2083원, 2회 출금액 1961원, 출금 후 122원
  // 출금 전 122원, 3회 출금액 102원, 출금 후 20원
  // 출금 전 20원, 4회 출금액 2원, 출금 후 18원
  // 출금 전 18원, 5회 출금액 17원, 출금 후 1원
  // 출금 전 1원, 6회 출금액 1원, 출금 후 0원
  public static void ex02() {
    int balance = 5000;  // 통장
    Random random = new Random();
    int count = 0;
    while(balance != 0) {
      count++;
      int withdraw = random.nextInt(balance)+1;
      System.out.println("출금 전 " + balance + "원, " + count + "회 출금액 " + withdraw + "원, 출금 후 " + (balance - withdraw));
      balance -= withdraw;
    }
    
  }
  
  // 문제3. 인증코드 6자리 만들기.
  // 0~9 사이 값을 이용하여 임의의 인증코드 6자리를 생성하시오. SecureRandom 클래스를 활용하시오.
  // 실행예시)
  // 인증코드: [966419]
  public static void ex03() {
    SecureRandom secureRandom = new SecureRandom();
    System.out.print("인증코드: [");
    for(int i = 0; i < 6; i++) {
      int randomNumber1 = secureRandom.nextInt(10);
      System.out.print(randomNumber1);
    }
    System.out.println("]");
  }
  
  // 문제4. 구구단을 외자.
  // 2~9단 사이의 임의의 구구단이 출력되면 사용자는 정답을 입력한다.
  // 정답을 입력해서 맞히면 "정답", 틀리면 "땡"을 출력하시오. Math 클래스의 random() 메소드를 활용하시오.
  // 실행예시1)
  //   4x9? >>> 36
  //   정답
  // 실행예시2)
  //   8x7? >>> 49
  //   땡
  public static void ex04() {
    Random random = new Random();
    int multi1 = random.nextInt(9) + 1;
    int multi2 = random.nextInt(9) + 1;
    Scanner sc = new Scanner(System.in);
    System.out.print(multi1 + "x" + multi2 + "? >>> ");
    int guess = sc.nextInt();
    if((multi1 * multi2) == guess) {
      System.out.println("정답");
    } else {
      System.out.println("땡");
    }
  }
  
  // 문제5. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
  // 실행예시1)
  //   "도", 1칸 이동한다.
  // 실행예시2)
  //   "개", 2칸 이동한다.
  // 실행예시3)
  //   "걸", 3칸 이동한다.
  // 실행예시4)
  //   "윷", "도", 5칸 이동한다.
  // 실행예시5)
  //   "모", "윷", "도", 10칸 이동한다.
  public static void ex05() {
    String[] yut = {"", "도", "개", "걸", "윷", "모"};
    Random random = new Random();
    int dice = 0, total = 0;
    
    while((yut[dice].equals("")) || (yut[dice].equals("윷")) || (yut[dice].equals("모"))) {
      dice = random.nextInt(5) + 1;
      System.out.print(yut[dice] + ", ");
      total += dice;
    }
    System.out.println(total + "칸 이동한다.");
  }
  
  // 문제6. 가위바위보.
  // 사용자로부터 "가위", "바위", "보" 중 하나를 입력 받아서 컴퓨터와 가위바위보를 진행하시오.
  // 내부적으로 가위는 0, 바위는 1, 보는 2로 처리하시오.
  // 실행예시)
  // 가위바위보 >>> 가위
  // 당신은 가위, 컴퓨터는 보, 당신은 이겼습니다.
  public static void ex06() {
    String[] rsp = {"가위", "바위", "보"};
    int com = (int)(Math.random() * 3);
    int user = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("가위바위보 >>> ");
    switch(sc.next()) {
    case "가위": user = 0; break;
    case "바위": user = 1; break;
    case "보":   user = 2; break;
    }
    String result = null;
    switch(user - com) {
    case -2:
    case 1:
      result = "이겼습니다.";
      break;
    case 0:
      result = "비겼습니다.";
      break;
    default:
      result = "졌습니다.";
    }
    System.out.println("당신은 " + rsp[user] + ", 컴퓨터는 " + rsp[com] + ", " + result);
    
  }
  
  // 문제7. "대문자+소문자+숫자"로 구성된 인증번호를 만드시오.
  // 사용자로부터 몇 자리의 인증번호를 만들것인지 입력 받아서 처리하시오.
  // 대문자와 소문자와 숫자는 임의의 비율로 나타나도록 처리하시오. SecureRandom 클래스를 활용하시오. 
  // 실행예시1)
  //   몇 자리의 인증번호를 생성할까요? >>> 4
  //   생성된 4자리 인증번호는 7W5e입니다.
  // 실행예시2)
  //   몇 자리의 인증번호를 생성할까요? >>> 6
  //   생성된 6자리 인증번호는 Fa013b입니다.
  public static void ex07() {
    Scanner sc = new Scanner(System.in);
    System.out.println("몇 자리의 인증번호를 생성할까요? >>> ");
    int count = sc.nextInt();
    SecureRandom secureRandom = new SecureRandom();
    StringBuilder sb = new StringBuilder();
    for(int n = 0; n < count; n++) {  // count만큼 반복하기
      double randomNumber = secureRandom.nextDouble();  // 0.0 <= randomNumber < 1.0
      if(randomNumber < 0.33) {
        sb.append(secureRandom.nextInt(10));
      } else if(randomNumber < 0.66) {
        sb.append((char)(secureRandom.nextInt(26) + 'A'));
      } else {
        sb.append((char)(secureRandom.nextInt(26) + 'a'));
      }
    }
    String code = sb.toString();
    System.out.println("생성된 " + count + "자리 인증번호는 " + code + "입니다.");
    sc.close();
  }
  
  // 문제8. UpDown 게임
  // 1 ~ 10000 사이의 난수를 발생시키고 해당 난수를 사용자가 맞히는 게임이다.
  // 입력마다 "Up!", "Down!" 메시지를 출력하시오.
  // 실행예시)
  // 입력 >>> 5000
  // Down!
  // 입력 >>> 2500
  // Up!
  // ...
  // 입력 >>> 4500
  // 정답. 총 5번만에 성공.
  public static void ex08() {
    int answer = (int)(Math.random() * 9999) + 1;
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while(true) {
      System.out.print("입력 >>>");
      int guess = sc.nextInt();
      count++;
      if(guess > answer) {
        System.out.println("Down");
      } else if(guess < answer) {
        System.out.println("Up");
      } else {
        System.out.println("정답. 총" + count + "번만에 성공.");
        break;
      }
    }
  }
  
  // 문제9. 0~9 사이 난수를 100개 생성하시오.
  // 발생한 0~9 사이의 각 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
  // 실행예시)
  // 0 : #### 4
  // 1 : ############ 12
  // 2 : ############ 12
  // 3 : ##### 5
  // 4 : ######## 8
  // 5 : ########### 11
  // 6 : ############ 12
  // 7 : ################## 18
  // 8 : ####### 7
  // 9 : ########### 11
  public static void ex09() {
    int[] number = new int[100];  // 100개 난수
    int[] count = new int[10];    // 각 숫자가 발생한 횟수
    
    for(int i = 0; i < 100; i++) {
      number[i] = (int)(Math.random() * 10);
    }
    
    for(int a : number) {
      switch(a) {
      case 0: count[0]++; break;
      case 1: count[1]++; break;
      case 2: count[2]++; break;
      case 3: count[3]++; break;
      case 4: count[4]++; break;
      case 5: count[5]++; break;
      case 6: count[6]++; break;
      case 7: count[7]++; break;
      case 8: count[8]++; break;
      case 9: count[9]++; break;
      }
    }
    
    for(int value = 0; value < 10; value++) {
      System.out.print(value + " : ");
      for(int freq = 0; freq < count[value]; freq++) {
        System.out.print("#");
      }
      System.out.println(" "+ count[value]);
    }
  }
  
  // 문제10. 다음 순서에 따라서 5 x 5 형태의 숫자 빙고판을 자동으로 생성하시오.
  // 지시사항)
  //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo에 순차적으로 넣는다.
  //      1  2  3  4  5
  //      6  7  8  9 10
  //     11 12 13 14 15
  //     16 17 18 19 20
  //     21 22 23 24 25
  //   2. 섞는다.
  //      총 25번의 교환이 랜덤하게 발생된다.
  //      bingo[0][0] <-> bingo[1][4]
  //      bingo[0][1] <-> bingo[0][2]
  //      bingo[0][2] <-> bingo[2][1]
  //      ...
  //      bingo[4][4] <-> bingo[3][1]
  // 실행예시)
  //  10  9  4 25  2
  //  15  3 13 21  1
  //  14 20 11 19  6
  //   8 17  5 12  7
  //  16 22 18 24 23
  public static void ex10() {
    final int SIZE = 5;
    int[][] bingo = new int[SIZE][SIZE];
    
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        bingo[i][j] = 5 * i + j + 1;
      }
    }
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        System.out.print(String.format("%4d", bingo[i][j]));
      }
      System.out.println();
    }
    
    for(int i = 0; i < 25; i++) {
      int r1 = (int)(Math.random()*5), r2 = (int)(Math.random()*5), r3 = (int)(Math.random()*5), r4 = (int)(Math.random()*5);
      int result1 = bingo[r1][r2];
      bingo[r1][r2] = bingo[r3][r4];
      bingo[r3][r4] = result1;
    }
    System.out.println("========================");
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        System.out.print(String.format("%3d", bingo[i][j]));
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
//    ex06();
//    ex07();
//    ex08();
    ex09();
    ex10();
  }

}