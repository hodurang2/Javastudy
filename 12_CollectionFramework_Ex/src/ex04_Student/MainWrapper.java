package ex04_Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 교실의 학생 정보 저장하는 HashMap만들기
    // Key : 학번(예: 10101)
    // Value : Student객체
    Map<Integer, Student> studentHashMap = new HashMap<Integer, Student>();    
    
    Exam exam1 = new Exam(88, 48, 96);
    Exam exam2 = new Exam(78, 56, 92);
    Exam exam3 = new Exam(92, 100, 32);
    Exam exam4 = new Exam(88, 96, 100);
    Exam exam5 = new Exam(48, 32, 44);
    
    studentHashMap.put(31036, new Student("정찬호", exam1));
    studentHashMap.put(31128, new Student("이민규", exam2));
    studentHashMap.put(30425, new Student("이영석", exam3));
    studentHashMap.put(30908, new Student("김지환", exam4));
    studentHashMap.put(31122, new Student("배정원", exam5));
    
    for(Entry<Integer, Student> entry : studentHashMap.entrySet()) {
      int key = entry.getKey();
      Student value = entry.getValue();
      System.out.println("이름: " + value.getName() + ", 학번: " + key + "\n성적: " + value.getExam());
    }
    System.out.println("===============================================");
    Integer[] stuNo = {31036, 31128, 30425, 30908, 31122};
    for(int i = 0; i < stuNo.length; i++) {
      Student student = studentHashMap.get(stuNo[i]);
      System.out.println("이름: "+ student.getName());
      System.out.println("성적: "+ student.getExam());
    }
    
    
    
    
  }

}
