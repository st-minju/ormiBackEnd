package WeeklyQuiz.sms;

public class Clothing extends Product {
  private String size;

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);
    this.size = size;
  }

  @Override
  public int calculatePrice() {
    if (size.equals("L") || size.equals("XL")) {
      return (int) (super.getPrice() * 1.1);
    }
    return super.calculatePrice();
  }
}
