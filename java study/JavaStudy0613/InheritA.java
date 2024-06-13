package JavaStudy0613;

public class InheritA {
  /*int field1;
  private int s1;

  void method1() {
    System.out.println("InheritA.method1 field1 = " + field1);
  }

  private void method3() {
    System.out.println("이것은 프라이빗");
  }*/
  int money = 0;

  void savingMoney() {
    this.money += 10000;
    System.out.println("현재 잔액은 " + money + "입니다.");
  }
}
