package WeeklyQuiz.Sms;

public class Manager {
  public static void main(String[] args) {
    Clothing clothing1 = new Clothing("Dress", 20000, 10, "S");
    Clothing clothing2 = new Clothing("Dress", 20000, 10, "M");
    Clothing clothing3 = new Clothing("Dress", 20000, 10, "L");
    Clothing clothing4 = new Clothing("Dress", 20000, 10, "XL");

    Electronics electronics1 = new Electronics("Laptop", 2000000, 30, "Samsung");
    Electronics electronics2 = new Electronics("Laptop", 2000000, 30, "Apple");
    Electronics electronics3 = new Electronics("Vacuum", 1000000, 15, "Samsung");

    Food food1 = new Food("Bread", 3000, 10, "20240710");
    Food food2 = new Food("Bread", 3000, 10, "20240623");
    Food food3 = new Food("Chicken", 30000, 10, "20240626");

    PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(12);
    premiumShoppingMall.addProduct(clothing1);
    premiumShoppingMall.addProduct(clothing2);
    premiumShoppingMall.addProduct(clothing3);
    premiumShoppingMall.addProduct(clothing4);
    premiumShoppingMall.addProduct(electronics1);
    premiumShoppingMall.addProduct(electronics2);
    premiumShoppingMall.addProduct(electronics3);
    premiumShoppingMall.addProduct(food1);
    premiumShoppingMall.addProduct(food2);
    premiumShoppingMall.addProduct(food3);

    System.out.println("***** 초기 상태 *****");
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("");

    System.out.println("***** addProduct() 실행 *****");
    premiumShoppingMall.addProduct(new Food("Chicken", 35000, 7, "20240630"));
    premiumShoppingMall.addProduct(new Food("Bread", 5000, 5, "20240701"));
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("");

    // 오버로딩
    System.out.println("***** removeProduct(food1) 실행 *****");
    premiumShoppingMall.removeProduct(food1);
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("");

    System.out.println("***** removeProduct(electronics1) 실행 *****");
    premiumShoppingMall.removeProduct(electronics1);
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("");

    System.out.println("***** addProduct() 실행 -> 인덱싱이 잘 수행되는지 확인! *****");
    premiumShoppingMall.addProduct(new Food("Bread", 5000, 5, "20240701"));
    premiumShoppingMall.addProduct(new Food("Bread", 3000, 15, "20240705"));
    premiumShoppingMall.addProduct(new Electronics("Laptop", 2000000, 30, "Samsung"));
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("");

    System.out.println("***** removeProduct(Chicken) 실행 *****");
    premiumShoppingMall.removeProduct("Chicken");
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("============");
  }
}
