package JavaStudy0614;

public class Main {
  public static void main(String[] args) {
    /*try {
      int result = 10 / 2;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");*/
    /*try {
        divide(10, 0);
      } catch (ArithmeticException e) {
        System.out.println("0으로 나눌 수 없습니다.");
      }
    }

    private static int divide(int a, int b) throws ArithmeticException {
      return a / b;
    }*/
    /*Scanner scanner = new Scanner(System.in);
    try {
      int i = scanner.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (NullPointerException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      scanner.close();
    }*/

    try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (NullPointerException ex) {
      System.out.println("null입니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
  }

  private static int divide(int a, int b) {
    if (a / b == 0) {
      throw new ArithmeticException();
    } else {
      throw new NullPointerException();
    }
  }
}
