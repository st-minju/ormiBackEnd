package JavaStudy0617.generic;

public class Main {
  public static void main(String[] args) {
    /*Box<String> stringBox = new Box<>();
    Box<Integer> integerBox = new Box<>();
    integerBox.set(1);*/

    Car<String> car = new Car<>();
    car.set("제네시스");
    System.out.println(car.get());
  }
}
