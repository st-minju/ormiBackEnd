package JavaStudy0613;

public class Child extends Parent {
  // 오버라이딩
  @Override
  void method2() {
    System.out.println("Child 메서드2 호출");
  }

  void method3() {
    System.out.println("Child 메서드3 호출");
  }
}
