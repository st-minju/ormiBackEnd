// 주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

public class RepeatChar {
  public static void main(String[] args) {
    System.out.println(repeatChar("The")); // "TThhee"
    System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
    System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
  }

  static String repeatChar(String str) {
    if (str.length() < 1) return str;
    return "" + str.charAt(0) + str.charAt(0) + repeatChar(str.substring(1));
  }
}
