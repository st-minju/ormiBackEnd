package WeeklyQuiz.sms;

import java.util.Arrays;

public abstract class ShoppingMall {
  Product[] products;
  private int addIndex = 0;

  public ShoppingMall(int arraySize) {
    products = new Product[arraySize];
  }

  public int getArraySize() {
    return products.length;
  }

  // 제품 추가(addProduct), 제품 삭제(removeProduct), 제품 목록 출력(displayProducts) 기능을 가진 메소드들을 오버로딩으로 생성할 것

  public void addProduct(Product product) {
    if (addIndex >= products.length) {
      makeArrayBigger();
    }
    products[addIndex] = product;
    addIndex++;
  }

  public void removeProduct(Product product, String name) {
    int[] removeIndexs = new int[products.length];
    Arrays.fill(removeIndexs, -1);
    int removeIndex = 0;
    if (Arrays.asList(products).contains(product)) {
      for (int i = 0; i < addIndex; i++) {
        if (products[i].getName().equals(name)) {
          products[i] = null;
          removeIndexs[removeIndex] = i;
          removeIndex++;
          addIndex--;
        }
      }
      // 삭제된 인덱스 위치 채우기
      int index = 0;
      while (removeIndexs[index] >= 0) {
        for (int i = removeIndexs[index]; i < removeIndexs[index + 1]; i++) {
          if (products[i] != null) {
            products[i] = products[index + 1];
          }
        }
        index++;
      }
    }
  }

  public void displayProducts() {
    for (int i = 0; i < products.length; i++) {
      if (products[i] != null) {
        System.out.print(
            (i + 1)
                + "번째 상품 "
                + "{상품명: "
                + products[i].getName()
                + ", "
                + "가격: "
                + products[i].calculatePrice()
                + ", "
                + "재고량: "
                + products[i].getStock());
        if (products[i] instanceof Clothing)
          System.out.println(", 사이즈: " + ((Clothing) products[i]).getSize() + "}");
        else if (products[i] instanceof Electronics)
          System.out.println(", 브랜드명: " + ((Electronics) products[i]).getBrand() + "}");
        else if (products[i] instanceof Food)
          System.out.println(", 유통기한: " + ((Food) products[i]).getExpirationDate() + "}");
      }
    }
  }

  public abstract boolean checkOrderAvailability();

  // 제품 추가 시 배열이 꽉 찼다면 기존 배열 크기의 2배로 새로운 배열을 생성하고
  // 기존 상품들을 복사한 후 새 상품을 추가할 것
  void makeArrayBigger() {
    Product[] temp = products;
    products = Arrays.copyOf(temp, temp.length * 2);
  }
}
