import java.util.*;

public class ArrayStudy {

  /** 2024-05-31 Array */
  public static void main(String[] args) {
    // int[] arr = new int[100];
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println(arr.length);
    // System.out.println(arr);
    System.out.println(arr[0]);
    if (6 > arr.length) {
      System.out.println(true);
    }

    String[] arr2 = new String[1000];
    List<String> list = new LinkedList<>();
    list.add("a");
    list.size();
    arr2 = list.toArray(arr2);
    System.out.println(arr2);
    System.out.println(arr2[0]);
  }
}
