package ex04_Lotto;

import java.util.Scanner;

public class Lotto {
  
  private Scanner sc = new Scanner(System.in);
  
  
  /*
  *** 1000 미만 입력 시 오류 ***
  Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> -10
  -10원 Lotto 구매는 불가능합니다.
  *** 1000000 초과 입력 시 오류 ***
  Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> 999999
  999999원 Lotto 구매는 불가능합니다.
  *** 정상 동작 ***
  Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> 11000
  01 :   37  22  39  42  11  45
  02 :    1  22  42  44  28  14
  03 :   34   7  26  10  27  13
  04 :   19  38  23  41  25  13
  05 :    4  25  42  44  14  15
  ------------------------------
  01 :   16  34  37  24  27  11
  02 :   37  38   8  42  27  13
  03 :   17  19  40  10  29  13
  04 :    1  34  39   7  42  12
  05 :   20  39   8  28  12  45
  ------------------------------
  01 :   33   9  41  12  45  31
  ------------------------------
   */
  public Lotto() {}

  /**
   * 로또 구매<br>
   * 로또 구매를 위해서 사용자로부터 money를 입력 받는 메소드<br>
   * 로또 구매 비용은 최소 1000, 최대 100000이다.<br>
   * @return money 사용자가 입력한 로또 구매 비용에서 1000 미만 단위는 버리고 반환. ex) 5999 입력 시 5000 반환
   * @return 0 로또 구매 실패 시 반환
   */
  public int buyLotto() throws RuntimeException {
    System.out.print("Lotto를 얼마나 구입하시겠습니까?(최대 10만원) >>> ");
    int money = sc.nextInt();
    if(money < 1000) {
      throw new RuntimeException("1000원 미만은 로또 구매가 불가능합니다. \n낸돈: " + money);
    }
    if(money > 100000) {
      throw new RuntimeException("100000원 초과는 로또 구매가 불가능합니다. \n낸돈: " + money);
    }
    return money;
  }
  
  /**
   * 로또 번호 생성<br>
   * 로또 구매 비용만큼 로또 번호를  생성하는 메소드<br>
   * 5게임씩 끊어서 생성된 로또 번호를 출력한다.<br>
   * @param money 로또 구매 비용
   */
  /*
   * 중복안나오게
   * 2중배열로
   */
  public void generateLotto(int money) {
    int count = (money / 1000), change = (money % 1000);
    for(int i = 0; i < count; i++) {
      String turn = String.format("%02d", i%5 +1);
      int num1 = (int)(Math.random() * 44 + 1);
      int num2, num3, num4, num5, num6;
      
      while(true) {
        num2 = (int)(Math.random() * 44 + 1);
        if(num1 != num2) {
          num3 = (int)(Math.random() * 44 + 1);
          if((num1 != num3) && (num2 != num3) ) {
            num4 = (int)(Math.random() * 44 + 1);
            if((num1 != num4) && (num2 != num4) && (num3 != num4)) {
              num5 = (int)(Math.random() * 44 + 1);
              if((num1 != num5) && (num2 != num5) && (num3 != num5) && (num4 != num5)) {
                num6 = (int)(Math.random() * 44 + 1);
                if((num1 != num6) && (num2 != num6) && (num3 != num6) && (num4 != num6) && num5 != num6) {
                  break;
                }
              }
            }
          } 
        }
      }
      
      
      System.out.println(turn + " : " + String.format("%4d", num1) + String.format("%4d", num2) + String.format("%4d", num3) + String.format("%4d", num4) + String.format("%4d", num5) + String.format("%4d", num6));
      if((i+1)%5 == 0) {
        System.out.println("------------------------------");
      }
    }
    System.out.println("구매: " + count + "장, 거스름돈: " + change);
  }
  
}