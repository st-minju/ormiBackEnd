import java.util.Random;
import java.util.Scanner;

public class NumberMatchGame {
  /** 2024-06-05 scanner, random class */
  public static void main(String[] args) {
    // 숫자 맞추기 게임 예제
    // 컴퓨터에서 추출한 숫자를 맞추는 게임
    // 난수 생성(1~100까지 난수를 추출하려면 (100-1)까지의 숫자를 랜덤으로 발생시키고 +1 해야함
    Random random = new Random();
    int targetNum = random.nextInt(100) + 1;
    int num = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("1~100 사이의 숫자를 맞춰보세요!");
    while (true) {
      num = input.nextInt();
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
