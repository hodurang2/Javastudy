package ex10_Cart;


public class Cart {
    
  /* Product 배열 길이 */ private final int CART_LENGTH = 10;
  /* Product 배열 */      private Product[] products;
  /* 담긴 Product 갯수 */ private int prodCount;
  
  // new Cart()
  public Cart() {
    products = new Product[CART_LENGTH];
  }

  public Product[] getProducts() {
    return products;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public int getProdCount() {
    return prodCount;
  }
  public void setProdCount(int prodCount) {
    this.prodCount = prodCount;
  }
  
  // 물건 넣기
  // addProduct(new Product("P0001", "냉장고", 200;)
  public void addProduct(Product product) {
    // 물건 못 넣는 경우
    if(prodCount == CART_LENGTH) {
      System.out.println("Cart is Full!!");
      return;
    }
    this.products[prodCount++] = product;
  }
  
  // 물건 바꾸기
  // changeProduct(1, new Product("제품번호", "제품명", 제품가격))
  public void changeProduct(int idx, Product product) {
    // 물건 못 바꾸는 경우
    if(idx < 0 || idx > prodCount) {
      System.out.println("There is no Product!");
      return;
    }
    this.products[idx] = product;
  }
  
  // 물건 빼기
  // deleteProduct(3)
  public void deleteProduct(int idx) {
    if(prodCount == 0) {
      System.out.println("Cart is already Empty!");
      return;
    }
    if(idx < 0 || idx > prodCount) {
      System.out.println("There is no Product!");
      return;
    }
    
    System.out.println(products[idx].getProdName());
    products[idx] = null;
    System.arraycopy(products, idx + 1, products, idx, prodCount - idx - 1);
    products[--prodCount] = null;
    
  }
  
}
