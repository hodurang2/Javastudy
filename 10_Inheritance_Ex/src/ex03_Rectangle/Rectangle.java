package ex03_Rectangle;

public class Rectangle {
  
  private int width;
  private int height;
  
  // new Rectangle()
  public Rectangle() {
    
  }
  // new Rectangle(10, 20) - 너비, 높이
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    
    
  }
  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  
  // 너비 반환 메소드
  public int getArea() {
    return width * height;
  }
  // 너비, 높이, 넓이 출력 메소드
  public void info() {
    System.out.println("너비: " + width + " 높이: " + height + " 넓이: " + getArea());
  }
}
