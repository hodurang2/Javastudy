package ex04_field;

public class MainWrapper {

  public static void main(String[] args) {
    
    // AccCalculator 객체 선언 & 생성
    AccCalculator myAcc = new AccCalculator();
    
    // value 확인
    myAcc.showValue();
    
    // 사칙연산
    myAcc.addition(3);
    myAcc.division(6);
    myAcc.multiplration(10);
    myAcc.sbustraction(3.5);
    myAcc.showValue();
    
    
    
    
    
  }

}
