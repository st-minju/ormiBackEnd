package WeeklyQuiz.sms;

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

    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("============");

    premiumShoppingMall.addProduct(new Food("Chicken", 35000, 7, "20240630"));
    premiumShoppingMall.addProduct(new Food("Chicken", 25000, 5, "20240701"));
    premiumShoppingMall.addProduct(new Food("Chicken", 35000, 10, "20240620"));
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("============");

    // 제거 메서드 실행 -> 전체가 다 안지워지는 이슈, 인덱스 앞으로 안당겨지는 이슈 수정하기
    premiumShoppingMall.removeProduct(food3, "Chicken");
    System.out.println("현재 배열 크기는 " + premiumShoppingMall.getArraySize());
    premiumShoppingMall.displayProducts();
    System.out.println("checkOrderAvailability = " + premiumShoppingMall.checkOrderAvailability());
    System.out.println("============");
  }
}
