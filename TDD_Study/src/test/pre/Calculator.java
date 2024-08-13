package pre;

public class Calculator {

  public int add(int augend, int addend) {
    return augend + addend;
  }

  public int subtract (int a, int b) {
    return a - b;
  }

  public int multiply(int multiplicand, int multiplier) {
    //return multiplicand * multiplier;
    throw new UnsupportedOperationException("곱하기는 아직 구현이 안되어 있습니다.")
  }
}
