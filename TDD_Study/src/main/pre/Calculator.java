package com.barabam.tdd_study;

public class Calculator {

  public int add(int augend, int addend) {
    return augend + addend;
  }

  /*public int addTwoIntegers(int a, int b) {
    return a + b;
  }*/

  public int addTwoIntegers(int a, int b) {
    if (willAdditionOverflow(a, b)) {
      if (a > 0) {
        return Integer.MIN_VALUE;
      } else {
        return Integer.MAX_VALUE;
      }
    }
    return a + b;
  }

  private boolean willAdditionOverflow(int a, int b) {
    if (b > 0 && a > Integer.MAX_VALUE - b) {
      return true;
    }
    if (b < 0 && a < Integer.MIN_VALUE - b) {
      return true;
    }
    return false;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int multiplicand, int multiplier) {
    // return multiplicand * multiplier;
    throw new UnsupportedOperationException("곱하기는 아직 구현이 안되어 있습니다.");
  }
}
