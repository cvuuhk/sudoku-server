package com.cuishuhao.sudokuserver.entity;

import com.cuishuhao.sudokuserver.common.ArrayToStringConverter;
import com.cuishuhao.sudokuserver.common.SudokuUtil;

import javax.persistence.*;

@Entity
public class Sudoku {

  @Id
  @GeneratedValue
  private long id;

  @Column
  @Convert(converter = ArrayToStringConverter.class)
  private int[] solution;

  @Column
  @Convert(converter = ArrayToStringConverter.class)
  private int[] puzzle;

  private double difficulty;

  public Sudoku() {}

  public Sudoku(int[] solution, int[] puzzle) {
    this.solution = new int[solution.length];
    this.puzzle = new int[puzzle.length];
    System.arraycopy(solution, 0, this.solution, 0, solution.length);
    System.arraycopy(puzzle, 0, this.puzzle, 0, puzzle.length);
    this.difficulty = SudokuUtil.computeDifficulty(puzzle);
  }

  public int[] getSolution() {
    int[] solution = new int[this.solution.length];
    System.arraycopy(this.solution, 0, solution, 0, solution.length);
    return solution;
  }

  public int[] getPuzzle() {
    int[] puzzle = new int[this.puzzle.length];
    System.arraycopy(this.puzzle, 0, puzzle, 0, puzzle.length);
    return puzzle;
  }

  public double getDifficulty() {
    return difficulty;
  }

  public void print() {
    System.out.println("difficulty:");
    System.out.println(difficulty);
    System.out.println("puzzle:");
    System.out.println(SudokuUtil.format(puzzle));
    System.out.println("solution:");
    System.out.println(SudokuUtil.format(solution));
  }
}
