package ex02_Computer;

public class Notebook extends Computer{
  
  private int battery;
  
  public Notebook(String model, int battery) {
    super(model);
    this.battery = battery;
  }
  
  public int getBattery() {
    return battery;
  }
  public void setBattery(int battery) {
    this.battery = battery;
  }
  
}
