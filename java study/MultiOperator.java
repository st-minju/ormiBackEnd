public class MultiOperator {
  /** 2024-06-03 이항연산자 */
  public static void main(String[] args) {
    System.out.println("Hello" + 123 + 456); // Hello123456
    System.out.println(123 + 456 + "Hello"); // 579Hello

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb); // 123456Hello

    int number1 = 10;
    int number2 = 30;

    System.out.println(number1 > number2); // false
    System.out.println(number1 >= number2); // false
    System.out.println(number1 < number2); // true
    System.out.println(number1 <= number2); // true
    System.out.println(number1 == number2); // true
    System.out.println(number1 != number2); // false
  }
}
