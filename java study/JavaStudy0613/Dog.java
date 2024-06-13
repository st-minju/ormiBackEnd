package JavaStudy0613;

public class Dog extends Animal {
  /*
    int age;

    public void sleep(int times) {
      System.out.println(this.name + " Zzzzz.... " + times + " hours");
    }

    public Dog(int age) {
      super("okay", "남");
      this.age = age;

      // new Animal();
    }

    void sleep(int times, int a) {}
  */

  public Dog() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
