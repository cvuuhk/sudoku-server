package com.cuishuhao.sudokuserver.entity;

import com.cuishuhao.sudokuserver.common.ArrayToStringConverter;

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
    this.solution = solution;
    this.puzzle = puzzle;
  }

  public int[] getSolution() {
    return solution;
  }

  public int[] getPuzzle() {
    return puzzle;
  }

  public double getDifficulty() {
    return difficulty;
  }
}
