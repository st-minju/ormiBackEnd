package WeeklyQuiz.sms;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int arraySize) {
    super(arraySize);
  }

  @Override
  public boolean checkOrderAvailability(Product product) {
    if (product.getStock() >= 10) return true;
    else return false;
  }
}
