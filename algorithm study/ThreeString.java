/*  주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

예제
입력: "Monitor"
출력: "nit"

요구사항
문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.*/

import java.util.Scanner;

public class ThreeString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("원하시는 문자열을 입력하세요. 더이상 찾을 단어가 없으면 '끝'을 입력하세요.");
      String letter = sc.nextLine();
      if (letter.equals("끝")) break;
      System.out.println(getMiddleThree(letter) + "\n");
    }
  }

  static String getMiddleThree(String letter) {
    String str = letter;
    int mid = 0;
    String res = "";
    if (str.length() % 2 != 0) {
      mid = str.length() / 2;
      res += str.substring(mid - 1, mid + 2);
      res = "찾으시는 세글자는 '" + res + "'입니다";
    } else if (str.length() <= 3) {
      res += "찾으시는 세글자는 '" + str + "'입니다";
    } else {
      res += "문자열의 길이는 " + str.length() + "이므로 짝수입니다.";
    }
    return res;
  }
}
