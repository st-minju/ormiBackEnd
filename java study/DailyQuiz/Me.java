package DailyQuiz;

public class Me {

  int age;
  String name;

  public Me(String name, int age) {
    this.age = age;
    this.name = name;
  }

  public void ListenToMusic(Hp hp) {
    System.out.println("나의 체력이 레벨업!!");
    System.out.println("나의 체력은 현재 " + hp.Up() + "입니다!");
  }

  public void Sleep(Hp hp) {
    System.out.println("나의 체력이 레벨업!!");
    System.out.println("나의 체력은 현재 " + hp.Up() + "입니다!");
  }

  public void Study(Hp hp) {
    System.out.println("나의 체력이 레벨다운ㅠㅠ");
    System.out.println("나의 체력은 현재 " + hp.Down() + "입니다!");
  }

  public void Work(Hp hp) {
    System.out.println("나의 체력이 레벨다운ㅠㅠ");
    System.out.println("나의 체력은 현재 " + hp.Down() + "입니다!");
  }
}
