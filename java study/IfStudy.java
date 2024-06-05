public class IfStudy {
  /** 2024-06-03 if문 */
  public static void main(String[] args) {
    /*   int a = 10;
      int b = 20;
      if (a > b) {
        System.out.println("a is greater than b");
      } else if (a < b) {
        System.out.println("a is less than b");
      } else {
        System.out.println("a and b are equal");
      }
      String res =
          (a > b) ? "a is greater than b" : (a < b) ? "a is less than b" : "a and b are equal";
    }*/

    int x = 10;
    String res = (x > 0) ? "x는 양수입니다." : (x < 0) ? "x는 음수입니다." : "x는 0입니다.";
    System.out.println(res);

    int score = 75;
    if (score >= 90) System.out.println("A");
    else if (score >= 80) System.out.println("B");
    else if (score >= 70) System.out.println("C");
    else if (score >= 60) System.out.println("D");
    else System.out.println("F");

    int year = 2023;
    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
      System.out.println(year + "년은 윤년입니다.");
    else System.out.println(year + "년은 윤년이 아닙니다.");

    int a = 10;
    int b = 20;
    int c = 30;
    if (a > b && a > c) System.out.println(a);
    else if (b > a && b > c) System.out.println(b);
    else if (c > a && c > b) System.out.println(c);

    int passScore = 60;
    int myScore = 75;
    System.out.println((passScore <= myScore) ? "합격" : "불합격");
  }
}
