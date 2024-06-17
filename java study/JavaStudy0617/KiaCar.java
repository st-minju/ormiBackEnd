package JavaStudy0617;

public class KiaCar implements Car {
  @Override
  public String showEngine() {
    return "엔진 호출";
  }

  @Override
  public int amountNavi() {
    System.out.println("내비 호출");
    return 10000000;
  }

  @Override
  public String getTier() {
    return "타이어 호출";
  }
}
