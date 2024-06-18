package WeeklyQuiz.sms;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int arraySize) {
    super(arraySize);
  }

  @Override
  public boolean checkOrderAvailability() {
    for (Product product : products) {
      if (product != null) {
        if (product.getStock() < 10) return false;
      } else break;
    }
    return true;
  }
}
