package com.barabam.tdd_study;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleTest {

  /*@Test
  void 간단한_덧셈_테스트() {
    int result = 1 + 1;
    Assertions.assertEquals(2, result, "1+1=2여야만 합니다.");
  }*/

  List<Integer> integerList;

  @BeforeEach
  void setUp() {
    integerList = new ArrayList<>();
    integerList.add(10);
  }

  @Test
  void 간단한_덧셈_테스트() {
    int result = 1 + 1;
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    integerList.add(50);
    assertEquals(4, result, "1+1 2여야만 합니다.");
  }

  @Test
  void 더하기_테스트() {
    assertEquals(integerList.size(), 1);
    //    assertEquals(2, 1 + 1);
  }

  @Test
  @DisplayName("1 더하기  1은 2와 같아야한다.")
  void 더하기_테스트2() {
    Assertions.assertThat(2).isEqualTo(1 + 1);
  }
}
