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

    /*String result = "";

    for(int i=0; i < str.length(); i++){
     char theChar = str.charAt(i);
     // result는 주소값, theChar은 유니코드를 가지고 있기 때문에
     // 문자열로 출력하기 위해서는 형변환을 해주어야한다.
     result += "" + theChar + theChar;
    }

    return result;*/
  }
}
