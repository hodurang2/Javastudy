package ex06_Member;

public class Member {

  private String name;        // 회원 이름
  private Contact contact;    // Contact class 호출
  
  // Setter 메소드
  public void setName(String name) {
    this.name = name;
  } 
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  // Getter 메소드
  public String getName() {
    return name;
  }
  public Contact getContact() {
    return contact;
  }
  
}
