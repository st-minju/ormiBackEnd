package WeeklyQuiz.sms;

import java.util.Arrays;

public abstract class ShoppingMall {
  Product[] products;
  private int addIndex = 0; // 제품이 추가될 때 마다 증가하는 필드

  public ShoppingMall(int arraySize) {
    products = new Product[arraySize];
  }

  public int getArraySize() {
    return products.length;
  }

  // 제품 추가(addProduct)
  public void addProduct(Product product) {
    if (addIndex >= products.length) {
      makeArrayBigger();
    }
    products[addIndex] = product;
    addIndex++;
  }

  // 제품 삭제(removeProduct)
  public void removeProduct(Product product) {
    int removeIndex = -1;
    if (Arrays.asList(products)
        .contains(
            product)) { // 매개변수로 받은 객체가 products에 존재하는지 확인 -> for문으로 확인하지 않고 products를 List로 변환시켜
      // 확인함
      for (int i = 0; i < addIndex; i++) {
        if (products[i].getName().equals(product.getName())
            && products[i].getPrice() == product.getPrice()
            && products[i].getStock() == product.getStock()
            && ((products[i] instanceof Clothing
                    && product instanceof Clothing
                    && ((Clothing) products[i]).getSize().equals(((Clothing) product).getSize()))
                || (products[i] instanceof Electronics
                    && product instanceof Electronics
                    && ((Electronics) products[i])
                        .getBrand()
                        .equals(((Electronics) product).getBrand()))
                || (products[i] instanceof Food
                    && product instanceof Food
                    && ((Food) products[i])
                        .getExpirationDate()
                        .equals(
                            ((Food) product)
                                .getExpirationDate())))) { // 배열의 객체와 매개변수 객체가 같은 것을 찾아 제거
          if (removeIndex == -1) {
            removeIndex = i;
          }
          products[i] = null;
          addIndex--;
          break;
        }
      }
      arrangeArray(removeIndex);
    }
  }

  // 오버로딩
  public void removeProduct(String name) {
    int removeIndex = -1, removeSize = 0;
    for (Product product : products) {
      if (product.getName().equals(name)) {
        for (int i = 0; i < addIndex; i++) {
          if (products[i].getName().equals(name)) {
            if (removeIndex == -1) {
              removeIndex = i;
            }
            products[i] = null;
            removeSize++;
          }
        }
        addIndex -= removeSize;
        arrangeArray(removeIndex);
        break;
      }
    }
  }

  // 제품 목록 출력(displayProducts)
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

  // 삭제된 인덱스 위치 채우기
  void arrangeArray(int removeIndex) {
    for (int i = removeIndex; i < products.length; i++) {
      for (int j = i + 1; j < products.length; j++) {
        if (products[j] != null) {
          products[i] = products[j];
          products[j] = null;
          break;
        }
      }
    }
  }
}
