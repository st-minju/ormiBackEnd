package JavaStudy0613;

/*public class Animal {
  String name;
  String gender;

  public void setName(String name) {
    this.name = name;
  }

  public Animal(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void sleep() {
    System.out.println(this.name + " Zzzzz....");
  }
}*/
public abstract class Animal {
  protected String kind;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  public abstract void sound();
}
