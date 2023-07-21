package ex06_Member;

public class Address {

  private String postCode;      // 우편번호
  private String roadAddr;      // 도로명주소
  private String jibunAddr;     // 지번주소
  private String detailAddr;    // 상세주소(동, 호수)
  
  // Setter 메소드
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
  public void setRoadAddr(String roadAddr) {
    this.roadAddr = roadAddr;
  }
  public void setJibunAddr(String jibunAddr) {
    this.jibunAddr = jibunAddr;
  }
  public void setDetailAddr(String detailAddr) {
    this.detailAddr = detailAddr;
  }

  // Getter 메소드
  public String getPostCode() {
    return postCode;
  }
  public String getRoadAddr() {
    return roadAddr;
  }
  public String getJibunAddr() {
    return jibunAddr;
  }
  public String getDetailAddr() {
    return detailAddr;
  }
  
  // Getter 한번에 호출하는 info 메소드
  public String info() {
    return "우편번호: " + getPostCode() + "\n도로명주소: " + getRoadAddr() + "\n지번주소: " + getJibunAddr()+ "\n상세주소: " + getDetailAddr();
  }

  
}
