package ex05_Employee;

// 프리랜서

public class Freelance extends Employee {

  private int hourlyWage;    // 시간당 임금
  private int workingHours;  // 근무한 시간
  
  public Freelance(String empNo, String name) {
    super(empNo, name);
  }

  public int getHourlyWage() {
    return hourlyWage;
  }
  public void setHourlyWage(int hourlyWage) {
    this.hourlyWage = hourlyWage;
  }
  public int getWorkingHours() {
    return workingHours;
  }
  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }
  @Override
  public void info() {
    // [사원번호:0002]
    // [사원명:구마적]
    // [시간당 임금:20000원]
    // [근무한 시간:160시간]
    // [급여:3104000원]
    super.info();
    System.out.println("  [시간당 임금:" + hourlyWage + "원]");
    System.out.println("  [근무한 시간:" + workingHours + "시간]");
    System.out.println("  [급여:" + (int)(getPay() * 0.97) + "원]");
  }
  @Override
  public int getPay() {
    return hourlyWage * workingHours;  // 프리랜서 급여는 시간당 임금 * 근무한 시간으로 계산한다. 세금은 편의상 3%로 한다.
  }
  
}