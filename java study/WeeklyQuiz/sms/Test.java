package WeeklyQuiz.sms;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    String[] array = new String[10];
    System.out.println(array.length);
    array[0] = "Hello";
    array[1] = "World";
    array[2] = "Hello";
    array[3] = "World";
    array[4] = "Hello";
    array[5] = "World";
    for (String str : array) {
      System.out.println(str);
    }
    System.out.println("=========");
    String[] temp = array;
    System.out.println(temp.length);
    array = Arrays.copyOf(temp, temp.length * 2);
    System.out.println(array.length);
    for (String str : array) {
      System.out.println(str);
    }
  }
}
