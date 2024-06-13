package WeeklyQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cal = 0;
    double numD1 = 0, numD2 = 0, resD = 0;
    int num1 = 0, num2 = 0, res = 0;
    boolean flag;

    while (true) {
      flag = false;
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
      try {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        numD1 = sc.nextDouble();
        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        numD2 = sc.nextDouble();
        if ((numD1 % 1 == (double) 0) && (numD2 % 1 == (double) 0)) {
          num1 = (int) numD1;
          num2 = (int) numD2;
          flag = true;
        }
      } catch (Exception e) {
        if (e instanceof InputMismatchException) {
          System.out.println("올바른 입력 값이 아닙니다. 숫자를 입력해주세요.");
        }
        continue;
      } finally {
        if (flag) {
          switch (cal) {
            case 1:
              res = num1 + num2;
              System.out.println(num1 + " + " + num2 + " = " + res);
              break;
            case 2:
              res = num1 - num2;
              System.out.println(num1 + " - " + num2 + " = " + res);
              break;
            case 3:
              res = num1 * num2;
              System.out.println(num1 + " * " + num2 + " = " + res);
              break;
            case 4:
              if (num2 != 0) {
                res = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + res);
              } else {
                System.out.println("0으로 나누는 것은 불가능 합니다.");
              }
              break;
          }
        } else {
          switch (cal) {
            case 1:
              resD = numD1 + numD2;
              System.out.println(numD1 + " + " + numD2 + " = " + resD);
              break;
            case 2:
              resD = numD1 - numD2;
              System.out.println(numD1 + " - " + numD2 + " = " + resD);
              break;
            case 3:
              resD = numD1 * numD2;
              System.out.println(numD1 + " * " + numD2 + " = " + resD);
              break;
            case 4:
              if (numD2 != 0) {
                resD = numD1 / numD2;
                System.out.println(numD1 + " / " + numD2 + " = " + resD);
              } else {
                System.out.println("0으로 나누는 것은 불가능 합니다.");
              }
              break;
          }
        }
      }
    }
    sc.close();
  }
}
