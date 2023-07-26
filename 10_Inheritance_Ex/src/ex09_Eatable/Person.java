package ex09_Eatable;

public class Person {
  
  public void eatEverything(Food food) {
//    this.food = food;
    System.out.println(food + "먹는다.");
  }
  
  public void eatPossible(Food food) {
//    this.food = food;
    if(food instanceof Eatable) {
      System.out.println(food + "먹는다.");
    } else {
      System.out.println(food + "이건 좀,,,");
    }
  }
  
//  public void eatPossible(Eatable food) {
////    this.food = food;
//    System.out.println(food + "먹는다.");
//  }
  

}
