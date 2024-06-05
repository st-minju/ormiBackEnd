import java.util.Random;
import java.util.Scanner;

public class NumberMatchGame {
  /** 2024-06-05 scanner, random class */
  public static void main(String[] args) {
    Random random = new Random();
    int targetNum = random.nextInt(100) + 1;
    Scanner input = new Scanner(System.in);
    System.out.println("1~100 사이의 숫자를 맞춰보세요!");
    while (true) {
      int num = input.nextInt();
      if (num == targetNum) {
        System.out.println("정답입니다!");
        break;
      } else if (num > targetNum) {
        System.out.println("더 낮게 불러봐요!");
      } else {
        System.out.println("더 높게 불러봐요!");
      }
    }
    input.close();
  }
}
