package WeeklyQuiz.sms;

public abstract class ShoppingMall {
  Product[] products;

  public ShoppingMall(int arraySize) {
    Product[] products = new Product[arraySize];
  }

  // 제품 추가(addProduct), 제품 삭제(removeProduct), 제품 목록 출력(displayProducts) 기능을 가진 메소드들을 오버로딩으로 생성할 것

  public void addProduct(Product product) {
    // 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고 기존 상품들을 복사한 후 새 상품을 추가할 것
  }

  public void removeProduct(Product product) {}

  public void displayProducts() {}

  public abstract boolean checkOrderAvailability(Product product);
}
