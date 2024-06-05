public class WhileStudy {
  /** 2024-06-04 while문 */
  public static void main(String[] args) {

    int i = 10;
    while (i >= 0) {
      System.out.println("현재 카운트 : " + i--);
    }
    System.out.println("카운트 종료");

    int n = 100;
    int sum = 0;
    while (0 < n) {
      sum += n;
      n--;
    }
    System.out.println("합은: " + sum);

    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int x = numbers.length;
    int avg = 0;
    while (x > 0) {
      avg += numbers[x - 1];
      x--;
    }
    avg /= numbers.length;
    System.out.println("평균은: " + avg);
  }
}
