package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
    // User객체 (객체명 user1)
    User user1 = new User();
    
    // User객체 user1에 데이터저장
    user1.setId("admin");
    user1.setPwd("1111");
    
    // User객체 user1의 데이터 확인
    System.out.println("ID : " + user1.getId() + "\nPwd : " + user1.getPwd());
  }
}
