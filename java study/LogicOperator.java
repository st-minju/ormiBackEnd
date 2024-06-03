public class LogicOperator {

  /** 2024-05-31 논리연산자 */
  public static void main(String[] args) {
    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가 내려와요...");
    } else if (!isRaining) {
      System.out.println("김태희가 안와요...");
    }

    boolean isSunny = false;
    if (!isSunny) {
      System.out.println("밖에 날씨가 맑아요!");
    } else if (isSunny) {
      System.out.println("날씨가 우중충하네요...");
    }
  }
}
