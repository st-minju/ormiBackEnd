package JavaStudy0620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    /*
       numbers.stream().filter(integer -> integer % 2 == 0);
       numbers.stream().map(integer -> integer * 2);
    numbers.stream().sorted();*/
    numbers.stream()
        .filter(integer -> integer % 2 == 0)
        .forEach(integer -> System.out.println(integer));
  }
}
