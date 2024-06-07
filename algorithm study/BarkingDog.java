/* 여러분은 아주 크게 짖는 개를 키우고 있습니다.
hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
barkingDogProblem(true, 7) ==> "든든하군!"
barkingDogProblem(false, 5) ==> "든든하군!"*/

import java.util.Scanner;

public class BarkingDog {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sayWhat = "";

    System.out.println("현재 강아지가 짖고있나요? 예 / 아니오");
    String isBark = sc.nextLine();
    System.out.println("현재 시간은 몇 시인가요? 0 ~ 23 사이의 숫자를 입력하세요.");
    int hour = sc.nextInt();
    if (isBark.equals("예")) {
      sayWhat = barkingDogProblem(true, hour);
    } else if (isBark.equals("아니오")) {
      sayWhat = barkingDogProblem(false, hour);
    }
    System.out.println(sayWhat);
  }

  static String barkingDogProblem(boolean barking, int hour) {
    String result = "든든하군!";
    if (barking && (hour < 7 || hour > 20)) {
      result = "짖으면 안돼!!";
    }
    return result;
  }
}
