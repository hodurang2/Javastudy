package ex10_Walkable;

public class Person {

  
  public void foodFeed(Animal animal, String food) {
    System.out.println(animal + "에게 " + food + "주기");
  }
  public void walk(Walkable animal) {
    System.out.println(animal + "이랑 산책하기");
  }
  
}
