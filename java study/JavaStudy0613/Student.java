package JavaStudy0613;

public class Student extends Person {
  int studentNo;

  public Student(String name, String ssn, int studentNo) {
    super(name, ssn); // 상속받을 필드
    this.studentNo = studentNo;
  }

  // 오버로딩 overloading
  public void say(String name) {
    System.out.println("My name is " + name);
  }
}
