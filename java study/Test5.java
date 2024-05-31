public class Test5 {

  /** 2024-05-31 String */
  public static void main(String[] args) {
    String firstName = "minju";
    String secondName = "kim";
    String phone = "Iphone";
    String status = "hungry";
    System.out.println("나는 " + secondName + " " + firstName + " 입니다.");

    String a = "EstSoft";
    System.out.println(a.equals("estsoft")); // false
    System.out.println("소문자: " + a.indexOf("s")); // 4
    System.out.println("대문자: " + a.indexOf("S")); // 4
    System.out.println(a.contains("Soft"));

    String b = "Hello world";
    System.out.println(b.charAt(5));
    System.out.println(b.charAt(6));
    System.out.println(b.charAt(7));
    System.out.println(b.charAt(8));
    System.out.println(b.replaceAll("world", "Spring"));
    System.out.println(b.replace("world", "Spring"));
    String c = "WEEEE ASKE ;ND";
    System.out.println(c.substring(0, 3) + c.substring(8, 10) + c.substring(12, 14));

    String d = "a:b:c:d";
    String[] result = d.split(":");
    System.out.println(result[0] + result[1] + result[2] + result[3]);
    // System.out.println(result[4]);

    String e = "Hello";
    System.out.println(e.concat("!"));

    String name1 = "Tim";
    int age1 = 30;
    String name2 = "Anna";
    int age2 = 45;
    String.format("%s의 나이는 %s세 입니다.", name1, age1);
    String.format("%s의 나이는 %s세 입니다.", name2, age2);

    String str = "Hello";
    String str2 = new String("Hello"); // 새로운 주소로 생성
    String str3 = "Hello"; // String Constant Pool에 의해 같은 주소에 저장
    String str4 = "Hello!";
    System.out.println(str.equals(str2)); // true
    System.out.println(str == str2); // false
    System.out.println(str == str3); // true
    System.out.println((str + "!") == str4); // false 애초에 str4가 다른 주소에 위치

    System.out.println(e.concat("!") == (str + "!")); // false
    System.out.println(e.concat("!") == str4); // false
  }
}
