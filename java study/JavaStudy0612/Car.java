package JavaStudy0612;

public class Car {
  private int speed;
  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  // protected String company = "weniv";

  /*public Car(int gear) {
    this.gear = gear;
  }*/

  public double getSpeed() {
    return this.speed * 1.6;
  }

  public int getGear() {
    return gear;
  }

  public String getWheel() {
    return wheel;
  }

  public int getCc() {
    return cc;
  }

  public String getLogo() {
    return logo;
  }

  public String getEngine() {
    return engine;
  }

  public void setSpeed(int speed) {
    this.speed = (speed < 0) ? 0 : speed;

    if (this.gear != 1 && this.speed >= 0 && this.speed <= 30) {
      this.gear = 1;
    } else if (this.gear != 2 && this.speed > 30 && this.speed <= 70) {
      this.gear = 2;
    } else if (this.gear != 3 && this.speed > 70 && this.speed <= 120) {
      this.gear = 3;
    } else if (this.speed > 120) {
      this.speed = 120;
      this.gear = 3;
      System.out.println("120 이상의 스피드를 낼 수 없으므로 기어를 바꿀 수 없습니다.");
    }
    System.out.println("현재 기어는 " + this.gear + "입니다.");
  }

  /*public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    }
    this.speed = speed;

    if (speed <= 30) {
      this.gear = 1;
    } else if (speed <= 70) {
      this.gear = 2;
    } else {
      this.gear = 3;
    }
  }*/

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void checkSpeed() {
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }
}
