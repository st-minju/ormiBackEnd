public class Student {
  int level;

  // 생성자
  public Student() {
    this.level = 1;
  }

  public void levelUp() {
    level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 당신의 레벨은 " + level + "입니다!");
  }

  public void levelDown() {
    if (level > 1) {
      level--;
      System.out.println("레벨이 1감소 했습니다.");
      System.out.println("현재 당신의 레벨은 " + level + "입니다!");
    } else {
      System.out.println("더이상 떨어질 레벨이 없습니다.");
    }
  }
}
