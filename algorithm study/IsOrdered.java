/*
세 개의 정수 first, second, third가 주어졌을 때,
second가 first보다 크고 third가 second보다 크면 true를 반환하는 코드를 작성하세요.
단, 마지막 opt 파라미터가 true인 경우에는 second가 first보다 크지 않아도 되지만,
여전히 third보다는 작아야 합니다.
*/

public class IsOrdered {
  public static void main(String[] args) {
    System.out.println(isOrdered(1, 2, 4, false)); // true
    System.out.println(isOrdered(1, 2, 1, false)); // false
    System.out.println(isOrdered(1, 1, 2, true)); // true
  }

  public static boolean isOrdered(int a, int b, int c, boolean opt) {
    /*boolean res = false;
    if (c > b) res = true;
    if (!opt && b < a) res = false;
    return res;*/
    /*if(opt) return b < c;
    return a < b && b < c;*/
    return opt ? b < c : a < b && b < c;
  }
}
