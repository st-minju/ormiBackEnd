import java.util.Scanner;

public class ScannerStudy {
  /** 2024-06-05 scanner class */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*System.out.println("정수를 입력하세요.");
        int num = sc.nextInt();
        System.out.println("제가 입력한 정수는 " + num + " 입니다.");
    */
    System.out.println("1~4 사이의 숫자를 입력하세요.");
    int season = sc.nextInt();
    switch (season) {
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }
    sc.close();
  }
}
