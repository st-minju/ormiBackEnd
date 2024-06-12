package DailyQuiz0611;

public class Hp {
  int hp;

  public Hp() {
    this.hp = 100;
  }

  public int Up() {
    hp++;
    return hp;
  }

  public int Down() {
    if (hp > 0) {
      hp--;
      return hp;
    } else {
      System.out.println("더이상 떨어질 체력이 없어...");
      return hp;
    }
  }
}
