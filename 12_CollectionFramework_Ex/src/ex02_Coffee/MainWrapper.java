package ex02_Coffee;

public class MainWrapper {

  public static void main(String[] args) {
    
    Cup cup1 = new Cup();
//    Coffee coffee1 = new Americano("");  서브클래스 객체 아메리카노를 Coffee타입으로 저장
//    cup1.setCoffee(coffee1);
    cup1.setCoffee(new Americano("아메리카노"));
    
    Cup cup2 = new Cup();
//    Coffee coffee2 = new CafeLatte("");
//    cup2.setCoffee(coffee2);
    cup2.setCoffee(new CafeLatte("카페라떼"));
    
    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
    for(int i = 0, length = p.getTray().size(); i < length; i++) {
      System.out.println((i+1) + "번째 커피: " + p.getTray().get(i).getCoffee()); // Person에 메소드를 만들지않고 for문으로 출력
    }
    System.out.println("===============");
    p.trayInfo(); // Person에 메소드 만들어서 출력
    
    
  }

}
