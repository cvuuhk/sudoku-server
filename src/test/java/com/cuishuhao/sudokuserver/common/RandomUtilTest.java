package com.cuishuhao.sudokuserver.common;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomUtilTest {

  @Test
  void shuffle() {
    int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    RandomUtil.shuffle(a);
    System.out.println(Arrays.toString(a));
  }
}