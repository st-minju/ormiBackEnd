public class Test8 {

  /** 2024-05-31 증감연산자 */
  public static void main(String[] args) {
    int x = 5;
    int y = 5;
    System.out.println("전위 증가 연산자: " + (++x));
    System.out.println("후위 증가 연산자: " + (y++));

    System.out.println("==============");
    System.out.println("x: " + x);
    System.out.println("y: " + y);

    System.out.println("==============");
    int a = 100;
    int b = 100;
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("후위 감소 연산자: " + (b--));
  }
}
