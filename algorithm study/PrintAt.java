// 문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
// 단, 재귀 함수를 이용하여 풀어보세요.

public class PrintAt {
  public static void main(String[] args) {
    System.out.println(printAt("hello"));
  }

  static String printAt(String str) {

    if (str.length() <= 1) {
      return str;
    }
    return str.charAt(0) + "@" + printAt(str.substring(1));
  }
}
