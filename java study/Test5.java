public class Test5 {

  /** 2024-05-31 String */
  public static void main(String[] args) {
    /*String firstName = "minju";
    String secondName = "kim";
    String phone = "Iphone";
    String status = "hungry";
    System.out.println("나는 " + secondName + " " + firstName + " 입니다.");\
    */
    /*String a = "EstSoft";
    System.out.println(a.contains("Soft"));

    String b = "Hello world";
    System.out.println(b.charAt(5));
    System.out.println(b.charAt(6));
    System.out.println(b.charAt(7));
    System.out.println(b.charAt(8));
    System.out.println(b.replaceAll("world", "Spring"));
    */
    String c = "WEEEE ASKE ;ND";
    System.out.println(c.substring(0, 3) + c.substring(8, 10) + c.substring(12, 14));

    String d = "a:b:c:d";
    String[] result = d.split(":");
    System.out.println(result[0] + result[1] + result[2] + result[3]);
    // System.out.println(result[4]);

    String e = "Hello";
    System.out.println(e.concat("!"));
  }
}
