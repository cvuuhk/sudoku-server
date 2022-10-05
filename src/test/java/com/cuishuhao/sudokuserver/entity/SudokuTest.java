package com.cuishuhao.sudokuserver.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {

  @Test
  public void test1() {
    int[] grid = new int[]{
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
    Sudoku sudoku = new Sudoku(grid, grid);
    assertArrayEquals(grid, sudoku.getPuzzle());
    assertArrayEquals(grid, sudoku.getSolution());

    // not equals
    // grid[0] = 0;
    // assertArrayEquals(grid, sudoku.getPuzzle());
    // assertArrayEquals(grid, sudoku.getSolution());
  }

  @Test
  public void test2() {
    int[] grid = new int[]{
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
    Sudoku sudoku = new Sudoku(grid, grid);
    sudoku.getPuzzle()[0] = 0;
    sudoku.getSolution()[0] = 0;
    assertArrayEquals(grid, sudoku.getPuzzle());
    assertArrayEquals(grid, sudoku.getSolution());
  }
}