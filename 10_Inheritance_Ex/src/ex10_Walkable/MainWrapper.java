package ex10_Walkable;

public class MainWrapper {

  public static void main(String[] args) {
    
    Dog dog = new Dog("모모");
    Snake snake = new Snake("오로치마루");
    
    Person p = new Person();
    
    p.foodFeed(dog, "고구마");   // 모모에게 고구마주기
    p.foodFeed(snake, "감자");   // 오로치마루한테 감자주기
    
    p.walk(dog);    // 모모와 산책하기
//    p.walk(snake);  // 컴파일 오류 발생
    
  }

}
