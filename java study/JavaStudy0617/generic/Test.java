package JavaStudy0617.generic;

public record Test() {
  public static void main(String[] args) {
    Box<Integer> boxing = Util.boxing(100);
  }
}
