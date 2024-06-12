package JavaStudy0612;

public class Test {
  public static void main(String[] args) {

    /*Person person1 = new Person("민주", 25);
    Person person2 = new Person("민중", 21);

    person1.sayHello();
    person1.introduce();
    System.out.println("");
    person2.sayHello();
    person2.introduce();*/

    /*Car car = new Car(3);
    car.setSpeed(-100);
    car.checkSpeed();
    System.out.println("");
    car.setSpeed(100);
    car.checkSpeed();
    System.out.println("");
    car.setSpeed(55);
    car.checkSpeed();
    System.out.println("");
    car.setSpeed(20);
    car.checkSpeed();
    System.out.println("");
    car.setSpeed(130);
    car.checkSpeed();*/

    Car car = new Car();
    car.setSpeed(100);
    System.out.println(car.getSpeed());
  }
}
