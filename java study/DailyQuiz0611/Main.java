package DailyQuiz0611;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("당신의 이름을 알려주세요: ");
    String name = sc.nextLine();
    System.out.print("당신의 나이를 알려주세요: ");
    int age = sc.nextInt();
    sc.nextLine();
    Me me = new Me(name, age);
    Hp hp = new Hp();

    me.ListenToMusic(hp);
    me.Study(hp);
    me.Work(hp);
    me.Sleep(hp);
  }
}
