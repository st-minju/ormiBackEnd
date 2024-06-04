public class ForTest {
  /** 2024-06-04 for문 */
  public static void main(String[] args) {

    /*int sum = 0;
    for (int n = 1; n <= 100; n++) {
      if (n % 2 == 0) sum += n;
    }
    System.out.println("합은: " + sum);

    int n = 20;
    sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) sum += i;
    }
    System.out.println("합은: " + sum);

    int fib1 = 1;
    int fib2 = 1;
    System.out.println("피보나치 수열 출력 Go!");
    for (int i = 0; i < 10; i += 2) {
      System.out.println(fib1);
      System.out.println(fib2);
      fib1 += fib2;
      fib2 += fib1;
    }
    int[] fib = new int[10];
    fib[0] = 1;
    fib[1] = 1;
    for (int i = 2; i < fib.length; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    System.out.println("피보나치 수열 출력 Go!");
    for (int i = 0; i < fib.length; i++) {
      System.out.println(fib[i]);
    }

    for (int i = 0; i >= -100; i--) {
      if (i % 2 == 0) System.out.println(i);
    }

    int[] arr = new int[100];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
    System.out.println("피보나치 수열 출력 Go!");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }*/

    /*for (int i = 1; i <= 100; i++) {
      if (i == 50) break;
      System.out.println("***** i는 " + i);
      for (int j = 2; j <= 100; j++) {
        if (j == 80) break;
        System.out.println("j는 " + j);
      }
    }*/

    /*int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
      int sum = 0;
      for (int i : scores) {
        sum += i;
      }
      System.out.println("총합: " + sum + " 평균: " + sum / scores.length);
    */
    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    for (String item : arr) {
      if (item.length() >= 5) System.out.println(item);
    }
  }
}
