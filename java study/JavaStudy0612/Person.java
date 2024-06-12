package JavaStudy0612;

public class Person {

  String name;
  int age;
  static final String NATION = "KOREA";
  static final String BLOOD_TYPE = "A";

  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("My name is " + this.name);
  }

  public void introduce() {
    System.out.println("I'm " + this.age + " years old");
    System.out.println("I'm born in " + NATION);
    System.out.println("My blood type is " + BLOOD_TYPE);
  }

  protected void testMethod() {
    System.out.println("test");
  }
}
