package ex05_Employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Company {

  private List<Employee> employees = new ArrayList<Employee>();
  private Scanner sc = new Scanner(System.in);
  
  public Company() {

  }
  
  public void addEmployee() {
    System.out.println("===== 고용 =====");
    System.out.print("고용 형태 선택(1.정규 2.프리랜서) >>> ");
    int choice = sc.nextInt();
    if(( choice != 1 ) && ( choice != 2 )) {
      throw new RuntimeException("올바르지 않은 고용형태입니다.");
    }
    System.out.print("사원번호 입력 >>> ");
    String empNo = sc.next();
    System.out.print("사원명 입력 >>> ");
    String name = sc.next();
    
    try {
      // 정규직등록
      if(choice == 1) {
        Employee employee = new Regular(empNo, name);
        System.out.print("기본급 입력 >>> ");
        int wage = sc.nextInt();
        ((Regular)employee).setSalary(wage);
        employees.add(employee);
      } else if(choice == 2) { // 프리랜서 등록
        Employee employee = new Freelance(empNo, name);
        System.out.print("시간당 임금 입력 >>> ");
        int wage = sc.nextInt();
        System.out.print("근무한 시간 입력 >>> ");
        int hour = sc.nextInt();
        ((Freelance)employee).setHourlyWage(wage);
        ((Freelance)employee).setWorkingHours(hour);
        employees.add(employee);
        System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 " + employees.size() + "명입니다.");
      }
    } catch (InputMismatchException e) {
      System.out.println("정수만 입력해야합니다.");
      sc.nextLine();
    }
  }
  
  public void dropEmployee() throws RuntimeException{
    if(employees.isEmpty()) throw new RuntimeException("사원이 1명도 없습니다.");
    System.out.println("===== 해고 =====");
    String empNo = sc.next();
    for(Employee employee : employees) {
      if(employee.getEmpNo().equals(empNo)) {
        System.out.println("다음 사원이 해고 되었습니다.");
        employees.remove(employee);
        break;
      } throw new RuntimeException("해당 사원이 존재하지 않습니다.");
    }
  }
  
  public void findEmployee() {
    if(employees.isEmpty()) throw new RuntimeException("사원이 1명도 없습니다.");
    System.out.println("===== 조회 =====");
    String empNo = sc.next();
    for(Employee employee : employees) {
      if(employee.getEmpNo().equals(empNo)) {
        System.out.println("사원 조회 성공");
        employee.info();
      } throw new RuntimeException("해당 사원이 존재하지 않습니다.");
    }
  }
  
  public void printAllEmployee() {
    if(employees.isEmpty()) throw new RuntimeException("사원이 1명도 없습니다.");
    System.out.println("===== 전체조회 =====");
    System.out.println("전체 사원 " + employees.size() + "명");
    int total = 0;
    for(Employee employee : employees) {
      System.out.println("------------------------");
      employee.info(); 
      total += employee.getPay();
    }
    System.out.println("  [사원 전체 급여: " + total + "원");
  }
  
  public void manage() {
    System.out.println("===== 사원관리프로그램 시작 =====");
    while(true) {
      try {
        System.out.print("\n1.고용 2.해고 3.조회 4.전체조회 0.종료 >>> ");
        String choice = sc.next();
        switch(choice) {
        case "1": addEmployee(); break;
        case "2": dropEmployee(); break;
        case "3": findEmployee(); break;
        case "4": printAllEmployee(); break;
        case "0": System.out.println("===== 사원관리프로그램 종료 ====="); return;
        default: throw new RuntimeException("잘못된 요청입니다. 다시 시도하세요.");
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
  
}