package ex04_Lotto;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LottoByMGT {

  private Scanner sc = new Scanner(System.in);
  
  public void generateLotto(int money) {
    
    while(money > 0) {
      int row = (money >= 5000) ? 5 : money / 1000;
      int[][] lotto = new int[row][6];
     for(int i = 0; i < lotto.length; i++) {
       SecureRandom secureRandom = new SecureRandom();
       Set<Integer> set = new HashSet<Integer>();
       while(set.size() != 6) {
         set.add(secureRandom.nextInt(45) + 1);
       }
       Iterator<Integer> arm = set.iterator();
       for(int j = 0; j < lotto[i].length; j++) {
         lotto[i][j] = arm.next();
       }
     }
     for(int i = 0; i < lotto.length; i++) {
       System.out.print(String.format("%02d", i+1) + ":");
       for(int j = 0; j < lotto[i].length; j++) {
         System.out.print(String.format("%4d", lotto[i][j]));
       }
       System.out.println();
     }
     System.out.println("------------------------------");
     money -= 5000;
    }
    
  }
  
  
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
}



