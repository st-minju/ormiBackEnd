public class BooleanStudy {
  /** 2024-06-03 boolean 연습 */
  public static void main(String[] args) {
    boolean x = true, y = false, z = false;
    if (x && !y) {
      System.out.println("조건 1 충족");
    }
    if (!y ^ z) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
