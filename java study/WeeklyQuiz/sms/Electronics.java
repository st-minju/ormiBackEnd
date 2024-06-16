package WeeklyQuiz.sms;

public class Electronics extends Product {
  private String brand;

  public Electronics(String name, int price, int stock, String brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    if (brand.equals("Apple")) {
      return (int) (super.getPrice() * 1.2);
    }
    return super.calculatePrice();
  }
}
