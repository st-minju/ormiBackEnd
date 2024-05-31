public class Test6 {
  /** 2024-05-31 StringBuilder StringBuffer */
  public static void main(String[] args) {
    String result = "";

    result += "Hello ";
    result += "Java ";
    result += "World";
    System.out.println(result);
    System.out.println(result.replace("hello", "~~~~"));
    System.out.println(result.replaceAll("hello", "~~~~"));

    // StringBuilder or StringBuffer는 String의 메모리 낭비를 보완하기 위해 사용
    // 문자열을 수정 및 조작할 때 사용 권장

    StringBuilder sb = new StringBuilder();
    sb.append("Hello ");
    sb.append("Java ");
    sb.append("World");
    System.out.println(sb); // Hello Java World
    sb.insert(0, "Hi ");
    System.out.println(sb); // Hi Hello Java World

    StringBuffer sf = new StringBuffer();
    sf.append("Hello ");
    sf.append("Java ");
    sf.append("World");
    System.out.println(sf); // Hello Java World
  }
}
