package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {
  
  /* 10진수 */ private int number; 
  /*  2진수 */ private List<Integer> binary;  // 리스트 선언

  // new BinaryNumber(32)
  public BinaryNumber(int number) {
    this.number = number;
    
    // binary ArrayList생성
    binary = new ArrayList<Integer>(); 

    // 반복문 돌면서 2진수 수집
    if(number == 0) {
      binary.add(0);
    } else {
      while(number != 0) {
        binary.add(number % 2);
        number /= 2;
      }
    }
  }
  

  @Override
  public String toString() {
    String result = "";
    System.out.print("10진수: " + this.number + "\n2진수: ");
    for(int i = binary.size(); i > 0; i--) {
      result += binary.get(i - 1);
    }
    
    for(int i = 0, length = binary.size(); i < length; i++) {
      binary.set(i, binary.get(length - i - 1));
    }
    

    return binary + "\n" + result;
  }
  
}
