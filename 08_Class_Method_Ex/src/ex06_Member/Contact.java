package ex06_Member;

public class Contact {

  private String homeTel;      // 집 전화번호
  private String mobile;       // 휴대폰 번호
  private Address address;     // Address class호출
  
  // Setter 메소드
  public void setHomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  
  
  // Getter 메소드 
  public String getHomeTel() {
    return homeTel;
  }
  public String getMobile() {
    return mobile;
  }
  public Address getAddres() {
    return address;
  }
  
  // Getter 한번에 호출하는 info메소드
  public String info() {
    return "집 전화번호: " + getHomeTel() + "\n휴대폰 번호: " + getMobile();
  }
}
