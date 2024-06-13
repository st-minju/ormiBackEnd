package JavaStudy0613;

public class InheritB extends InheritA {
  /*String field2;

  void method2() {
    System.out.println("InheritB.method2 field = " + field2);
  }*/
  void investingMoney() {
    if (money - 10000 >= 0) {
      money -= 10000;
      System.out.println("현재 잔액은 " + money + "입니다.");
    } else {
      System.out.println("출금할 돈이 부족합니다.");
    }
  }
}
