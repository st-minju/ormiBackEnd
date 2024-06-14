package JavaStudy0613;

public class InheritanceTest {
  public static void main(String[] args) {
    /*InheritB inheritB = new InheritB();*/
    /*
      inheritB.field2 = "필드2";
      inheritB.method2();

      inheritB.field1 = 100;
      inheritB.method1();
    }*/
    /*inheritB.savingMoney();
    inheritB.investingMoney();
    inheritB.savingMoney();
    inheritB.savingMoney();
    inheritB.investingMoney();*/
    /*Dog dog = new Dog(123);
    System.out.println("나이: " + dog.age + "살, 이름: " + dog.name);
    dog.setName("용팔이");
    System.out.println("나이: " + dog.age + "살, 이름: " + dog.name);
    dog.sleep();
    dog.sleep(100);*/
    /*Student student = new Student("승조", "a", 123);
    System.out.println(student.name);
    System.out.println(student.ssn);
    System.out.println(student.studentNo);*/
    /*Child child = new Child();
    child.method1();
    child.method2(); // child 메서드가 호출됨
    child.method3();*/
    /*int r = 10;
    WeeklyQuiz.Calculator calculator = new WeeklyQuiz.Calculator();
    System.out.println("원면적 " + calculator.areaCircle(r));
    Computer computer = new Computer();
    System.out.println("원면적 " + computer.areaCircle(r));*/
    SmartPhone smartPhone = new SmartPhone("김민주");
    smartPhone.turnOn();
    smartPhone.turnOff();
    smartPhone.internetSearch();
  }
}
