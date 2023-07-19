package ex03_class;

/**
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 제공하는 계산기 클래스
 * 
 * @author JeongChanHo
 * @since 2023/07/19
 * @version 1.0.0
 * 
 */
public class Calculator {
  
  /**
   * 
   * 실수 2개를 전달 받아서 그 합을 반환하는 메소드
   * 
   * @param a                         type : 실수
   * @param b                         type : 실수
   * @return 파라미터 2개를 더한 결과 type : 실수
   */
  public double addition(double a, double b) {
    return a + b;
  }

  /**
   * 
   * @param from 빼질 값              type:실수
   * @param to   빼야할 값            type : 실수
   * @return 파라미터 2개를 뺀 결과   type : 실수
   */
  public double subtraction(double from, double to) {
    return from - to;
  }

  /**
   * 
   * @param a                         type : 실수
   * @param b                         type : 실수
   * @return 파라미터 2개를 곱한 결과 type : 실수
   */
  public double multiplication(double a, double b) {
    return a * b;
  }
  
  /**
   * 
   * @param from 나눠질 값            type : 실수
   * @param to   나눠줄 값            type : 실수
   * @return share 파라미터 2개를 나눈 몫 type : 실수
   * @return remain 파라미터 2개를 나눈 나머지 type : 실수
   * @return result 몫과 나머지를 리턴하는 결과 type : double배열
   */
  public double[] division(double from, double to) {
    double share = Math.floor(from / to);
    double remain = from % to;
    double[] result = {share, remain};
    return result;
  }

}
