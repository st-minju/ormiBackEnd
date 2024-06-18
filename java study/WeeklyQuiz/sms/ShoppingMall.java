package WeeklyQuiz.sms;

import java.util.Arrays;

public abstract class ShoppingMall {
  Product[] products;

  public ShoppingMall(int arraySize) {
    products = new Product[arraySize];
  }

  // 제품 추가(addProduct), 제품 삭제(removeProduct), 제품 목록 출력(displayProducts) 기능을 가진 메소드들을 오버로딩으로 생성할 것

  public void addProduct(Clothing clothing) {}

  public void addProduct(Electronics electronics) {}

  public void addProduct(Food food) {}

  public void removeProduct(Clothing clothing) {}

  public void removeProduct(Electronics electronics) {}

  public void removeProduct(Food food) {}

  public void displayProducts(Clothing clothing) {}

  public void displayProducts(Electronics electronics) {}

  public void displayProducts(Food food) {}

  public abstract boolean checkOrderAvailability(Product product);

  // 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고
  // 기존 상품들을 복사한 후 새 상품을 추가할 것
  void makeArrayBigger() {
    Product[] temp = products;
    products = Arrays.copyOf(temp, temp.length * 2);
  }
}
