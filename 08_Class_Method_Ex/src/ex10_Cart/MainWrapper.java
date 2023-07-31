package ex10_Cart;

public class MainWrapper {

  public static void main(String[] args) {
    
    Customer c = new Customer(100_000, 1000);
    
    Cart cart = new Cart();
    
    c.setCart(cart);
    
    c.addProductToCart(new Product("1", "양파링", 1_000));
    c.addProductToCart(new Product("2", "새우깡", 2_000));
    c.addProductToCart(new Product("3", "맛동산", 3000));
    
    c.changeFromCart(0, new Product("4", "꼬북칩", 5000));
    
    c.deleteFromCart(1);
    
    
    String receipt = c.buy();
    
    System.out.println(receipt);
    
    System.out.println(c);
    
  }

}
