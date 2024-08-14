package com.barabam.tdd_study;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// @DisplayName("계산기 테스트")
public class CalculatorTest {

  private Calculator calculator;

  /*  @BeforeAll
  static void setUpAll() {
    System.out.println("테스트 시작!");
  }*/

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
    System.out.println("각 테스트 시작 전 실행");
  }

  /*
    @Test
    @DisplayName("1 더하기 1은 2여야 한다.")
    void testAddition() {
      Assertions.assertThat(2).isEqualTo(calculator.add(1, 1));
    }

    @Test
    @DisplayName("5 빼기 3은 2여야 한다.")
    void testSubtraction() {
      assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equals 2");
    }

    @Test
    @Disabled("곱하기 기능은 아직 구현되지 않았습니다.")
    void testMultiplication() {
      assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equals 6");
    }

    @AfterEach
    void tearDown() {
      System.out.println("@AfterEach - 각 테스트 종료 후 실행");
    }

    @AfterAll
    static void tearDownAll() {
      System.out.println("@AfterAll -  모든 테스트 종료 후 1번 실행");
    }
  */

  @Test
  @DisplayName("양수 값 더하기")
  void testAddTwoPositiveNumbers() {
    int result = calculator.addTwoIntegers(3, 4);
    assertEquals(7, result, "3+4 should equal 7");
  }

  @Test
  @DisplayName("음수 값 더하기")
  void testTwoNegativeNumbers() {
    int result = calculator.addTwoIntegers(3, -4);
    assertEquals(-1, result, "-1 필요");
  }

  @Test
  @DisplayName("양수와 음수 더하기")
  void testAddPositiveAndNegativeNumber() {
    int result = calculator.addTwoIntegers(3, -4);
    assertEquals(-1, result, "3 + (-4) should equal -1");
  }

  @Test
  @DisplayName("0 더하기")
  void testAddZero() {
    int result = calculator.addTwoIntegers(3, 0);
    assertEquals(3, result, "3 + 0 should equal 3");
  }

  @Test
  @DisplayName("오버플로우가 발생하는 덧셈")
  void testAddWithOverflow() {
    assertEquals(
        Integer.MIN_VALUE,
        calculator.addTwoIntegers(Integer.MAX_VALUE, 1),
        "Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
  }
}
