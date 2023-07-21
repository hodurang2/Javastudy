package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {

    
    // 정보 추가 (Setter 메소드 활용)
    Address address = new Address();
    address.setDetailAddr("남서울 힐스테이트 202동 1603호");
    address.setJibunAddr("금천구 시흥동 1381번지");
    address.setPostCode("08646");
    address.setRoadAddr("시흥대로 165");
    
    Contact contact = new Contact();
    contact.setAddress(address);
    contact.setHomeTel("02-111-3333");
    contact.setMobile("010-1234-5678");
    
    Member member = new Member();
    member.setContact(contact);
    member.setName("호두랑이");
    
    // member 정보 확인 (Getter 메소드 활용)
    System.out.println("===== Getter로 호출 =====");
    System.out.println("이름: " + member.getName());
    System.out.println("집 전화번호: " + member.getContact().getHomeTel());
    System.out.println("휴대폰 번호: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddres().getPostCode());
    System.out.println("지번주소: " + member.getContact().getAddres().getJibunAddr());
    System.out.println("도로명번호: " + member.getContact().getAddres().getRoadAddr());
    System.out.println("상세주소: " + member.getContact().getAddres().getDetailAddr());
    
    // member 정보 확인 (info 메소드 활용)
    System.out.println("\n===== info로 호출 =====");
    System.out.println("이름: " + member.getName());
    System.out.println(member.getContact().info());
    System.out.println(member.getContact().getAddres().info());
    member.getContact().getAddres().info();
  }

}
