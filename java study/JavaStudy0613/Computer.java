package JavaStudy0613;

public class Computer extends Calculator {
  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 객체 실행!");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("say yeah~~");
  }
}
