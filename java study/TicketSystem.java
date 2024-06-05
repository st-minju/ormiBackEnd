import java.util.Scanner;

public class TicketSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("당신이 보고싶은 영화의 제목을 입력하세요!");
    String movie = scanner.nextLine();
    System.out.println("관람하실 인원을 입력하세요.");
    int people = scanner.nextInt();
    scanner.nextLine();
    System.out.println("예매자의 성함을 입력하세요.");
    String name = scanner.nextLine();
    System.out.println("에매자의 전화번호를 입력하세요.");
    String phone = scanner.nextLine();

    System.out.println("***** 영화 티켓 예매 정보 *****");
    System.out.println("영화 제목: " + movie);
    System.out.println("관람 인원: " + people + "명");
    System.out.println("예매자 이름: " + name);
    System.out.println("예매자 전화번호: " + phone);
    System.out.println("총 결제 금액: " + (10000 * people) + "원");

    scanner.close();
  }
}
