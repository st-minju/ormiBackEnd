package WeeklyQuiz.sms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food extends Product {
  private String expirationDate;

  public Food(String name, int price, int stock, String expirationDate) {
    super(name, price, stock);
    this.expirationDate = expirationDate;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public int calculatePrice() {
    // 20240618 같은 형식으로 오늘 날짜 불러오기
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    int todayDate = Integer.parseInt(today.format(formatter));

    // Food의 calculatePrice()는 유통기한이 7일 이하로 남았다면 가격에서 20%를 할인하여 리턴함
    // 유통기한으로 설정된 날짜와 오늘날짜를 뺀 결과가 7일 이하인지 확인
    if (Integer.parseInt(expirationDate) - todayDate <= 7) {
      return (int) ((super.getPrice() * 0.8) / 10 * 10); // 20프로 할인 + 1원짜리 없애기
    }
    return super.calculatePrice();
  }
}
