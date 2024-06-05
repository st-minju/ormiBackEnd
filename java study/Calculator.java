import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cal, num1, num2 = 0;

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
      cal = sc.nextInt();

      if (cal == 0) {
        System.out.println("계산이 종료됩니다.");
        break;
      } else if (cal > 4 || cal < 0) {
        System.out.println("올바른 입력이 아닙니다.");
        continue;
      }
      System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
      num1 = sc.nextInt();
      System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
      num2 = sc.nextInt();

      switch (cal) {
        case 1:
          System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          break;
        case 2:
          System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
          break;
        case 3:
          System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
          break;
        case 4:
          System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
          break;
      }
    }
  }
}
