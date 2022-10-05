package com.cuishuhao.sudokuserver.common;

import org.junit.jupiter.api.Test;

import static com.cuishuhao.sudokuserver.common.SudokuUtil.gridLength;
import static org.junit.jupiter.api.Assertions.*;

class SudokuUtilTest {

  @Test
  void getRow() {
    assertEquals(1, SudokuUtil.getRow(1));
    assertEquals(1, SudokuUtil.getRow(2));
    assertEquals(1, SudokuUtil.getRow(3));
    assertEquals(1, SudokuUtil.getRow(4));
    assertEquals(1, SudokuUtil.getRow(5));
    assertEquals(1, SudokuUtil.getRow(6));
    assertEquals(1, SudokuUtil.getRow(7));
    assertEquals(1, SudokuUtil.getRow(8));
    assertEquals(1, SudokuUtil.getRow(9));

    assertEquals(2, SudokuUtil.getRow(10));
    assertEquals(2, SudokuUtil.getRow(11));
    assertEquals(2, SudokuUtil.getRow(12));
    assertEquals(2, SudokuUtil.getRow(13));
    assertEquals(2, SudokuUtil.getRow(14));
    assertEquals(2, SudokuUtil.getRow(15));
    assertEquals(2, SudokuUtil.getRow(16));
    assertEquals(2, SudokuUtil.getRow(17));
    assertEquals(2, SudokuUtil.getRow(18));

    assertEquals(3, SudokuUtil.getRow(19));
    assertEquals(3, SudokuUtil.getRow(20));
    assertEquals(3, SudokuUtil.getRow(21));
    assertEquals(3, SudokuUtil.getRow(22));
    assertEquals(3, SudokuUtil.getRow(23));
    assertEquals(3, SudokuUtil.getRow(24));
    assertEquals(3, SudokuUtil.getRow(25));
    assertEquals(3, SudokuUtil.getRow(26));
    assertEquals(3, SudokuUtil.getRow(27));

    assertEquals(4, SudokuUtil.getRow(28));
    assertEquals(4, SudokuUtil.getRow(29));
    assertEquals(4, SudokuUtil.getRow(30));
    assertEquals(4, SudokuUtil.getRow(31));
    assertEquals(4, SudokuUtil.getRow(32));
    assertEquals(4, SudokuUtil.getRow(33));
    assertEquals(4, SudokuUtil.getRow(34));
    assertEquals(4, SudokuUtil.getRow(35));
    assertEquals(4, SudokuUtil.getRow(36));

    assertEquals(5, SudokuUtil.getRow(37));
    assertEquals(5, SudokuUtil.getRow(38));
    assertEquals(5, SudokuUtil.getRow(39));
    assertEquals(5, SudokuUtil.getRow(40));
    assertEquals(5, SudokuUtil.getRow(41));
    assertEquals(5, SudokuUtil.getRow(42));
    assertEquals(5, SudokuUtil.getRow(43));
    assertEquals(5, SudokuUtil.getRow(44));
    assertEquals(5, SudokuUtil.getRow(45));

    assertEquals(6, SudokuUtil.getRow(46));
    assertEquals(6, SudokuUtil.getRow(47));
    assertEquals(6, SudokuUtil.getRow(48));
    assertEquals(6, SudokuUtil.getRow(49));
    assertEquals(6, SudokuUtil.getRow(50));
    assertEquals(6, SudokuUtil.getRow(51));
    assertEquals(6, SudokuUtil.getRow(52));
    assertEquals(6, SudokuUtil.getRow(53));
    assertEquals(6, SudokuUtil.getRow(54));

    assertEquals(7, SudokuUtil.getRow(55));
    assertEquals(7, SudokuUtil.getRow(56));
    assertEquals(7, SudokuUtil.getRow(57));
    assertEquals(7, SudokuUtil.getRow(58));
    assertEquals(7, SudokuUtil.getRow(59));
    assertEquals(7, SudokuUtil.getRow(60));
    assertEquals(7, SudokuUtil.getRow(61));
    assertEquals(7, SudokuUtil.getRow(62));
    assertEquals(7, SudokuUtil.getRow(63));

    assertEquals(8, SudokuUtil.getRow(64));
    assertEquals(8, SudokuUtil.getRow(65));
    assertEquals(8, SudokuUtil.getRow(66));
    assertEquals(8, SudokuUtil.getRow(67));
    assertEquals(8, SudokuUtil.getRow(68));
    assertEquals(8, SudokuUtil.getRow(69));
    assertEquals(8, SudokuUtil.getRow(70));
    assertEquals(8, SudokuUtil.getRow(71));
    assertEquals(8, SudokuUtil.getRow(72));

    assertEquals(9, SudokuUtil.getRow(73));
    assertEquals(9, SudokuUtil.getRow(74));
    assertEquals(9, SudokuUtil.getRow(75));
    assertEquals(9, SudokuUtil.getRow(76));
    assertEquals(9, SudokuUtil.getRow(77));
    assertEquals(9, SudokuUtil.getRow(78));
    assertEquals(9, SudokuUtil.getRow(79));
    assertEquals(9, SudokuUtil.getRow(80));
    assertEquals(9, SudokuUtil.getRow(81));
  }

  @Test
  void getColumn() {
    assertEquals(1, SudokuUtil.getColumn(1));
    assertEquals(2, SudokuUtil.getColumn(2));
    assertEquals(3, SudokuUtil.getColumn(3));
    assertEquals(4, SudokuUtil.getColumn(4));
    assertEquals(5, SudokuUtil.getColumn(5));
    assertEquals(6, SudokuUtil.getColumn(6));
    assertEquals(7, SudokuUtil.getColumn(7));
    assertEquals(8, SudokuUtil.getColumn(8));
    assertEquals(9, SudokuUtil.getColumn(9));

    assertEquals(1, SudokuUtil.getColumn(10));
    assertEquals(2, SudokuUtil.getColumn(11));
    assertEquals(3, SudokuUtil.getColumn(12));
    assertEquals(4, SudokuUtil.getColumn(13));
    assertEquals(5, SudokuUtil.getColumn(14));
    assertEquals(6, SudokuUtil.getColumn(15));
    assertEquals(7, SudokuUtil.getColumn(16));
    assertEquals(8, SudokuUtil.getColumn(17));
    assertEquals(9, SudokuUtil.getColumn(18));

    assertEquals(1, SudokuUtil.getColumn(19));
    assertEquals(2, SudokuUtil.getColumn(20));
    assertEquals(3, SudokuUtil.getColumn(21));
    assertEquals(4, SudokuUtil.getColumn(22));
    assertEquals(5, SudokuUtil.getColumn(23));
    assertEquals(6, SudokuUtil.getColumn(24));
    assertEquals(7, SudokuUtil.getColumn(25));
    assertEquals(8, SudokuUtil.getColumn(26));
    assertEquals(9, SudokuUtil.getColumn(27));

    assertEquals(1, SudokuUtil.getColumn(28));
    assertEquals(2, SudokuUtil.getColumn(29));
    assertEquals(3, SudokuUtil.getColumn(30));
    assertEquals(4, SudokuUtil.getColumn(31));
    assertEquals(5, SudokuUtil.getColumn(32));
    assertEquals(6, SudokuUtil.getColumn(33));
    assertEquals(7, SudokuUtil.getColumn(34));
    assertEquals(8, SudokuUtil.getColumn(35));
    assertEquals(9, SudokuUtil.getColumn(36));

    assertEquals(1, SudokuUtil.getColumn(37));
    assertEquals(2, SudokuUtil.getColumn(38));
    assertEquals(3, SudokuUtil.getColumn(39));
    assertEquals(4, SudokuUtil.getColumn(40));
    assertEquals(5, SudokuUtil.getColumn(41));
    assertEquals(6, SudokuUtil.getColumn(42));
    assertEquals(7, SudokuUtil.getColumn(43));
    assertEquals(8, SudokuUtil.getColumn(44));
    assertEquals(9, SudokuUtil.getColumn(45));

    assertEquals(1, SudokuUtil.getColumn(46));
    assertEquals(2, SudokuUtil.getColumn(47));
    assertEquals(3, SudokuUtil.getColumn(48));
    assertEquals(4, SudokuUtil.getColumn(49));
    assertEquals(5, SudokuUtil.getColumn(50));
    assertEquals(6, SudokuUtil.getColumn(51));
    assertEquals(7, SudokuUtil.getColumn(52));
    assertEquals(8, SudokuUtil.getColumn(53));
    assertEquals(9, SudokuUtil.getColumn(54));

    assertEquals(1, SudokuUtil.getColumn(55));
    assertEquals(2, SudokuUtil.getColumn(56));
    assertEquals(3, SudokuUtil.getColumn(57));
    assertEquals(4, SudokuUtil.getColumn(58));
    assertEquals(5, SudokuUtil.getColumn(59));
    assertEquals(6, SudokuUtil.getColumn(60));
    assertEquals(7, SudokuUtil.getColumn(61));
    assertEquals(8, SudokuUtil.getColumn(62));
    assertEquals(9, SudokuUtil.getColumn(63));

    assertEquals(1, SudokuUtil.getColumn(64));
    assertEquals(2, SudokuUtil.getColumn(65));
    assertEquals(3, SudokuUtil.getColumn(66));
    assertEquals(4, SudokuUtil.getColumn(67));
    assertEquals(5, SudokuUtil.getColumn(68));
    assertEquals(6, SudokuUtil.getColumn(69));
    assertEquals(7, SudokuUtil.getColumn(70));
    assertEquals(8, SudokuUtil.getColumn(71));
    assertEquals(9, SudokuUtil.getColumn(72));

    assertEquals(1, SudokuUtil.getColumn(73));
    assertEquals(2, SudokuUtil.getColumn(74));
    assertEquals(3, SudokuUtil.getColumn(75));
    assertEquals(4, SudokuUtil.getColumn(76));
    assertEquals(5, SudokuUtil.getColumn(77));
    assertEquals(6, SudokuUtil.getColumn(78));
    assertEquals(7, SudokuUtil.getColumn(79));
    assertEquals(8, SudokuUtil.getColumn(80));
    assertEquals(9, SudokuUtil.getColumn(81));
  }

  @Test
  void getSubGrid() {
    assertEquals(1, SudokuUtil.getSubgrid(1));
    assertEquals(1, SudokuUtil.getSubgrid(2));
    assertEquals(1, SudokuUtil.getSubgrid(3));
    assertEquals(2, SudokuUtil.getSubgrid(4));
    assertEquals(2, SudokuUtil.getSubgrid(5));
    assertEquals(2, SudokuUtil.getSubgrid(6));
    assertEquals(3, SudokuUtil.getSubgrid(7));
    assertEquals(3, SudokuUtil.getSubgrid(8));
    assertEquals(3, SudokuUtil.getSubgrid(9));

    assertEquals(1, SudokuUtil.getSubgrid(10));
    assertEquals(1, SudokuUtil.getSubgrid(11));
    assertEquals(1, SudokuUtil.getSubgrid(12));
    assertEquals(2, SudokuUtil.getSubgrid(13));
    assertEquals(2, SudokuUtil.getSubgrid(14));
    assertEquals(2, SudokuUtil.getSubgrid(15));
    assertEquals(3, SudokuUtil.getSubgrid(16));
    assertEquals(3, SudokuUtil.getSubgrid(17));
    assertEquals(3, SudokuUtil.getSubgrid(18));

    assertEquals(1, SudokuUtil.getSubgrid(19));
    assertEquals(1, SudokuUtil.getSubgrid(20));
    assertEquals(1, SudokuUtil.getSubgrid(21));
    assertEquals(2, SudokuUtil.getSubgrid(22));
    assertEquals(2, SudokuUtil.getSubgrid(23));
    assertEquals(2, SudokuUtil.getSubgrid(24));
    assertEquals(3, SudokuUtil.getSubgrid(25));
    assertEquals(3, SudokuUtil.getSubgrid(26));
    assertEquals(3, SudokuUtil.getSubgrid(27));

    assertEquals(4, SudokuUtil.getSubgrid(28));
    assertEquals(4, SudokuUtil.getSubgrid(29));
    assertEquals(4, SudokuUtil.getSubgrid(30));
    assertEquals(5, SudokuUtil.getSubgrid(31));
    assertEquals(5, SudokuUtil.getSubgrid(32));
    assertEquals(5, SudokuUtil.getSubgrid(33));
    assertEquals(6, SudokuUtil.getSubgrid(34));
    assertEquals(6, SudokuUtil.getSubgrid(35));
    assertEquals(6, SudokuUtil.getSubgrid(36));

    assertEquals(4, SudokuUtil.getSubgrid(37));
    assertEquals(4, SudokuUtil.getSubgrid(38));
    assertEquals(4, SudokuUtil.getSubgrid(39));
    assertEquals(5, SudokuUtil.getSubgrid(40));
    assertEquals(5, SudokuUtil.getSubgrid(41));
    assertEquals(5, SudokuUtil.getSubgrid(42));
    assertEquals(6, SudokuUtil.getSubgrid(43));
    assertEquals(6, SudokuUtil.getSubgrid(44));
    assertEquals(6, SudokuUtil.getSubgrid(45));

    assertEquals(4, SudokuUtil.getSubgrid(46));
    assertEquals(4, SudokuUtil.getSubgrid(47));
    assertEquals(4, SudokuUtil.getSubgrid(48));
    assertEquals(5, SudokuUtil.getSubgrid(49));
    assertEquals(5, SudokuUtil.getSubgrid(50));
    assertEquals(5, SudokuUtil.getSubgrid(51));
    assertEquals(6, SudokuUtil.getSubgrid(52));
    assertEquals(6, SudokuUtil.getSubgrid(53));
    assertEquals(6, SudokuUtil.getSubgrid(54));

    assertEquals(7, SudokuUtil.getSubgrid(55));
    assertEquals(7, SudokuUtil.getSubgrid(56));
    assertEquals(7, SudokuUtil.getSubgrid(57));
    assertEquals(8, SudokuUtil.getSubgrid(58));
    assertEquals(8, SudokuUtil.getSubgrid(59));
    assertEquals(8, SudokuUtil.getSubgrid(60));
    assertEquals(9, SudokuUtil.getSubgrid(61));
    assertEquals(9, SudokuUtil.getSubgrid(62));
    assertEquals(9, SudokuUtil.getSubgrid(63));

    assertEquals(7, SudokuUtil.getSubgrid(64));
    assertEquals(7, SudokuUtil.getSubgrid(65));
    assertEquals(7, SudokuUtil.getSubgrid(66));
    assertEquals(8, SudokuUtil.getSubgrid(67));
    assertEquals(8, SudokuUtil.getSubgrid(68));
    assertEquals(8, SudokuUtil.getSubgrid(69));
    assertEquals(9, SudokuUtil.getSubgrid(70));
    assertEquals(9, SudokuUtil.getSubgrid(71));
    assertEquals(9, SudokuUtil.getSubgrid(72));

    assertEquals(7, SudokuUtil.getSubgrid(73));
    assertEquals(7, SudokuUtil.getSubgrid(74));
    assertEquals(7, SudokuUtil.getSubgrid(75));
    assertEquals(8, SudokuUtil.getSubgrid(76));
    assertEquals(8, SudokuUtil.getSubgrid(77));
    assertEquals(8, SudokuUtil.getSubgrid(78));
    assertEquals(9, SudokuUtil.getSubgrid(79));
    assertEquals(9, SudokuUtil.getSubgrid(80));
    assertEquals(9, SudokuUtil.getSubgrid(81));
  }

  @Test
  void format() {
    int[] puzzle = new int[]{
            4,1,7,3,0,9,8,2,5,
            6,3,2,1,5,8,9,4,7,
            9,5,8,7,2,4,3,1,6,
            8,2,5,4,3,7,0,6,9,
            7,9,0,5,8,6,4,0,2,
            3,4,0,9,1,2,7,5,8,
            2,8,0,6,4,3,5,0,1,
            5,7,3,2,9,1,6,8,4,
            1,6,4,8,7,5,2,9,3
    };

    System.out.println(SudokuUtil.format(puzzle));
  }

  @Test
  void convertToString() {
    int[] puzzle = new int[]{
            4,1,7,3,0,9,8,2,5,
            6,3,2,1,5,8,9,4,7,
            9,5,8,7,2,4,3,1,6,
            8,2,5,4,3,7,0,6,9,
            7,9,0,5,8,6,4,0,2,
            3,4,0,9,1,2,7,5,8,
            2,8,0,6,4,3,5,0,1,
            5,7,3,2,9,1,6,8,4,
            1,6,4,8,7,5,2,9,3
    };

    String excepted = "417309825632158947958724316825437069790586402340912758280643501573291684164875293";

    assertEquals(excepted, SudokuUtil.convertToString(puzzle));
  }

  @Test
  void convertToArray() {
    int[] expected = new int[]{
            4,1,7,3,0,9,8,2,5,
            6,3,2,1,5,8,9,4,7,
            9,5,8,7,2,4,3,1,6,
            8,2,5,4,3,7,0,6,9,
            7,9,0,5,8,6,4,0,2,
            3,4,0,9,1,2,7,5,8,
            2,8,0,6,4,3,5,0,1,
            5,7,3,2,9,1,6,8,4,
            1,6,4,8,7,5,2,9,3
    };

    String str = "417309825632158947958724316825437069790586402340912758280643501573291684164875293";

    assertArrayEquals(expected, SudokuUtil.convertToArray(str));
  }

  @Test
  void createSolution() {
    int[] solution = SudokuUtil.createSudoku().getSolution();
    System.out.println(SudokuUtil.format(solution));
  }
}