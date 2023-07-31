package ex10_Cart;

import java.text.DecimalFormat;

public class Customer {
  
  /* Cart */    private Cart cart;
  /* 돈 */      private int money;
  /* 포인트 */  private int point;
  
  // new Customer(100_000, 1000);
  public Customer() {}

  public Customer(int money, int point) {
    super();
    this.money = money;
    this.point = point;
  }

  public Cart getCart() {
    return cart;
  }
  public void setCart(Cart cart) {
    this.cart = cart;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  public int getPoint() {
    return point;
  }
  public void setPoint(int point) {
    this.point = point;
  }
  
  // 카트에 물건 넣기
  public void addProductToCart(Product product) {
    cart.addProduct(product);
  }
  
  // 카트의 물건 바꾸기
  public void changeFromCart(int idx, Product product) {
    cart.changeProduct(idx, product);
  }
  
  // 카트의 물건 빼기
  public void deleteFromCart(int idx) {
    cart.deleteProduct(idx);
  }
  
  // 물건 구매하기
  // 
  public String buy() {
    String receipt = "------ 영수증 ------\n";
    int totalPrice = 0;
    int totalPoint = 0;
    
    
    // 구매가 불가능한 경우
    if(money < totalPrice) {
      System.out.println("그지");
      return "";
    }
    
    for(int i = 0, length = cart.getProdCount(); i < length; i++) {
      totalPrice += cart.getProducts()[i].getProdPrice();
      totalPoint += cart.getProducts()[i].getProdPrice() * 0.1;
      receipt += String.format("%-10s", cart.getProducts()[i].getProdName());
      receipt += String.format("%8s", new DecimalFormat("#, ##0").format(cart.getProducts()[i].getProdPrice()));
      receipt += "\n";
    }
    
    receipt += "낸돈:         " + money + "\n내야할 돈:      " + totalPrice + "\n";
    money -= totalPrice;
    receipt += "거스름돈:      " + money + "\n";
    
    
    receipt += "누적 포인트:    " + point + "\n발생 포인트:     " + totalPoint + "\n";
    point += totalPoint;
    receipt += "누적 포인트:    " + point + "\n------ 영수증 ------";
    return receipt;
  }

  @Override
  public String toString() {
    return "Customer [money=" + money + ", point=" + point + "]";
  }
  
  
  
}
