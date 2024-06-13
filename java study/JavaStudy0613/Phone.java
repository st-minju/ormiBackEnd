package JavaStudy0613;

public abstract class Phone {
  private String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("휴대폰 전원 키는 중...");
  }

  public void turnOff() {
    System.out.println("휴대폰 전원 끄는 중...");
  }
}
