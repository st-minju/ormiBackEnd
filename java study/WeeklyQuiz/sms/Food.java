package WeeklyQuiz.sms;

public class Food extends Product {
  private String expirationDate;

  public Food(String name, int price, int stock, String expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice() {
    // Food의 calculatePrice()는 유통기한이 7일 이하로 남았다면 가격에서 20%를 할인하여 리턴함

    /*if (Integer.parseInt(expirationDate) - Integer.parseInt(todayDate) <= 7) {
      return (int) (super.getPrice() * 0.8);
    }*/
    return super.calculatePrice();
  }
}
