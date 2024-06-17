package JavaStudy0617;

public class SamsungPhone implements Phone, Quality {

  @Override
  public String call() {
    return "갤럭시가 전화를 받습니다.";
  }

  @Override
  public String answerThePhone() {
    return "갤럭시로 전화를 받습니다.";
  }

  @Override
  public String good() {
    return "";
  }
}
