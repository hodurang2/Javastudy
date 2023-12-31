package exam;

public class MainWrapper {

	// 문제1. int number의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
	// int number의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
	// 예시
	// 남자입니다.
	public static void q1() {
		int number = 1234567;
		if(number / 1000000 % 2 == 0) {
		  System.out.println("여자");
		}
		System.out.println("남자");
	}
	
	// 문제2. int a와 int b에 저장된 결과를 이용해서 사칙연산 결과를 출력하시오.
	// 예시
	// 7 + 2 = 9
	// 7 - 2 = 5
	// 7 * 2 = 14
	// 7 / 2 = 3.5
	public static void q2() {
		int a = 7;
		int b = 2;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " +  ((double)a / b));
		
	}
	
	// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
	public static void q3() {
		for(int i = 2; i <= 9; i++) {
		  if(i > 5) {
		    break;
		  }
		  for(int j = 1; j <= 9; j++) {
		    if(i == 5 && j > 5) {
		      break;
		    }
		    System.out.println(i + " x " + j + " = " + (i*j));
		    
		  }
		}
	}
	
	// 문제4. begin부터 end 사이의 모든 정수들의 평균을 출력하시오.
	// 단, 항상 begin은 end보다 작거나 같은 상태이다.
	// 예시
	// 1부터 6사이 모든 정수의 평균은 3.5입니다.
	public static void q4() {
		int begin = 1;
		int end = 6;
		int total = 0;
		for(int i = begin; i <= end; i++) {
		  total += i;
		}
		System.out.println(begin + "부터" + end + " 사이 모든 정수의 평균은" + total / (double) (end - begin + 1) + "입니다.");
	}
	
	// 문제5. 1부터 100 사이의 모든 3의 배수를 더한 결과를 출력하시오.
	// 예시
	// 모든 3의 배수 합은 1683입니다.
	public static void q5() {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
		  if(i%3 == 0) {
		    total += i;
		  }
		}
		System.out.println("모든 3의 배수 합은 " + total + "입니다.");
	}
	
	// 문제6. 배열에 저장된 모든 정수를 모두 더하시오.
	// 단, 0보다 작은 값은 더하지 마시오.
	// 예시
	// 합계는 6입니다.
	public static void q6() {
		int total = 0;
		int[] a = {1, -1, -2, 2, 3, -3};
		for(int i : a) {
		  if(i < 0) {
		    continue;
		  }
		  total += i;
		}
		System.out.println("합계는 " + total + "입니다.");
	}
	
	// 문제7. 제시된 배열 a에 상수 TARGET과 동일한 문자가 몇 개 포함되어 있는지 갯수를 구해서 출력하시오.
	// 예시
	// 배열에 포함된 h는 2개입니다.
	public static void q7() {
		final char TARGET = 'h';
		char[] a = {'a', 'h', 'e', 'h', 'p'};
		int total = 0;
		for(int i : a) {
		  if(i == TARGET) {
		    total++;
		  }
		}
		System.out.println("배열에 포함된 h는 " + total + "개 입니다.");
	}
	
	// 문제8. 점수에 따라 가져갈 수 있는 모든 사은품을 출력하시오.
	// 점수가 60점 이상인 경우 : "행주"
	// 점수가 70점 이상인 경우 : "행주도마"
	// 점수가 80점 이상인 경우 : "행주도마식칼"
	// 점수가 90점 이상인 경우 : "행주도마식칼냄비"
	// 예시
	// 행주도마
	public static void q8() {
		String strScore = "100";
		int score = Integer.parseInt(strScore);
		String gift = "";
		switch (score/10) {
		case 10:
		case  9:
		  gift = "냄비" + gift;
		case  8:
		  gift = "식칼" + gift;
		case  7:
		  gift = "도마" + gift;
		case  6:
		  gift = "행주" + gift;
		  break;
		}
		
		System.out.println("사은품: " + gift);
		
	}
	
	// 문제9. 1 ~ 100 사이의 정수를 대상으로 369 게임 결과를 아래와 같이 출력하시오.
	// 예시
	// 1   2   짝   4   5   짝   7   8   짝   10
	// 11  12  짝   14  15  짝   17  18  짝   20
	// 21  22  짝   24  25  짝   27  28  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 40
	// ...
	// 81  82  짝   84  85  짝   87  88  짝   짝
	// 짝  짝  짝짝 짝  짝  짝짝 짝  짝  짝짝 100
	public static void q9() {
		boolean condition1 = false;  // 일의 자리가 3의 배수인가?
		boolean condition2 = false;  // 십의 자리가 3의 배수인가?
		for(int i = 1; i <= 100; i++) {
		  int result = i % 10;
		  if(result == 3 || result == 6 || result == 9) {
		    condition1 = true;
		  } else {
		    condition1 = false;
		  }
		  result = i / 10;
		  if(result == 3 || result == 6 || result == 9) {
		    condition2 = true;
		  } else {
		    condition2 = false;
		  }
		  if(condition1 && condition2) {
		    System.out.print("짝짝 ");
		  } else if(condition1 || condition2) {
		    System.out.print("짝   ");
		  } else {		    
		    System.out.print(String.format("%-5d", i));
		  }
		  if(i % 10 == 0) {
		    System.out.println();
		  }
		  
		  
		  }
	}
	
	// 문제10. 5명의 이름과 점수를 각각의 배열에 저장하였다.
	// 가장 높은 점수를 받은 사람의 이름을 출력하시오.
	// 예시
	// 가장 높은 점수를 받은 사람은 정숙입니다.
	public static void q10() {
		String[] name = {"철수", "영희", "정숙", "상철", "미희"};
		int[] score = {50, 60, 90, 80, 70};
		int max = score[0];
		int top = 0;
		for(int i = 0; i < name.length; i++) {
		  if(max <= score[i]) {
		    max = score[i];
		    top = i;
		  } 
		}
		System.out.println("가장 높은 점수를 받은 사람은 " + name[top] + "입니다.");
	}
	
	public static void q11() {
 
    boolean condition1 = false;  // 일의 자리가 3의 배수인가?
    boolean condition2 = false;  // 십의 자리가 3의 배수인가?
    
    for(int i = 1; i <= 100; i++) {
      
      condition1 = i % 10 % 3 == 0;
      condition2 = i / 10 % 3 == 0;
      
      // 10의 배수들이 3의 배수로 인식 되는 것 방지
      if(i % 10 == 0) {
        condition1 = false;
      }
      // 1 ~ 9가 3의 배수로 인식 되는 것 방지
      if(i / 10 == 0) {
        condition2 = false;
      }
      
      if(condition1 == true && condition2 == true) {
        System.out.print(String.format("%-3s", "짝짝"));
      } else if(condition1 == true || condition2 == true) {
        System.out.print(String.format("%-4s", "짝"));
      } else {
        System.out.print(String.format("%-5d", i));          
      }
      
      if(i % 10 == 0) {
        System.out.println();
      }
    }
    

  }
	

	
	// main 메소드는 그대로 사용합니다.
	public static void main(String[] args) {
//		System.out.println("=====문제1=====");
//		q1();
//		System.out.println("=====문제2=====");
//		q2();
//		System.out.println("=====문제3=====");
//		q3();
//		System.out.println("=====문제4=====");
//		q4();
//		System.out.println("=====문제5=====");
//		q5();
//		System.out.println("=====문제6=====");
//		q6();
//		System.out.println("=====문제7=====");
//		q7();
		System.out.println("=====문제8=====");
		q8();
//		System.out.println("=====문제9=====");
//		q9();
//		System.out.println("=====문제10=====");
//		q10();
//		System.out.println("=====문제11=====");
//		q11();
	}

}
