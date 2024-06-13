package JavaStudy0613;

public class Person {
  String name;
  String ssn;

  public Person(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }

  public void say() {
    System.out.println("My name is " + this.name);
  }
}
