package com.cuishuhao.sudokuserver.common;

import com.cuishuhao.sudokuserver.entity.Sudoku;

public class SudokuUtil {

  public static final int gridLength = 81;
  public static final int sideLength = 9;

  private static final boolean[][] rows = new boolean[sideLength][sideLength];
  private static final boolean[][] columns = new boolean[sideLength][sideLength];
  private static final boolean[][] subGrids = new boolean[sideLength][sideLength];

  public static String format(int[] grid) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < grid.length; i++) {

      if (i == 0 || i == 27 || i == 54) builder.append("+-----+-----+-----+\n");

      int column = getColumn(i+1);
      if (column == 1 || column == 4 || column == 7) builder.append("|");
      else builder.append(" ");

      if (grid[i] == 0) builder.append(" ");
      else builder.append(grid[i]);

      if (column == 9) builder.append("|").append("\n");
    }

    return builder.append("+-----+-----+-----+").toString();
  }

  // 获取第 i 个格子所在的行号
  // i：第 i 个格子，1 <= i <= 81
  // 返回行号 n，1 <= n <= 9
  public static int getRow(int i) {
    return (i-1) / 9 + 1;
  }

  // 获取第 i 个格子所在的列号
  // i：第 i 个格子，1 <= i <= 81
  // 返回列号 n，1 <= n <= 9
  public static int getColumn(int i) {
    return (i-1) % 9 + 1;
  }

  // 获取第 i 个格子所在的宫
  // i：第 i 个格子，1 <= i <= 81
  // 返回宫号 n，1 <= n <= 9
  public static int getSubGrid(int i) {
    int row = getRow(i), column = getColumn(i);
    return (row-1) / 3 * 3 + (column-1) / 3 + 1;
  }

  public static String convertToString(int[] grid) {
    StringBuilder builder = new StringBuilder();
    for (int box : grid) builder.append(box);

    return builder.toString();
  }

  public static int[] convertToArray(String str) {
    int[] ret = new int[str.length()];

    for (int i = 0; i < str.length(); i++)
      ret[i] = str.charAt(i) - '0';

    return ret;
  }

  public static Sudoku createSudoku() {
    int[] solution = createSolution();
    int[] puzzle = createPuzzle(solution);
    return new Sudoku(solution, puzzle);
  }

  private static int[] createSolution() {
    int[] solution = new int[gridLength];
    fillSolution(solution, 1);

    return solution;
  }

  private static boolean fillSolution(int[] solution, int i) {
    if (i == gridLength+1) return true;
    if (solution[i-1] != 0) return fillSolution(solution, i+1);

    int[] available = getAvailable(i);
    RandomUtil.shuffle(available);

    for (int k : available) {
      if (k == 0) continue;

      solution[i-1] = k;
      mark(i, k, true);
      boolean done = fillSolution(solution, i + 1);
      mark(i, k, false);
      if (done) return true;
      solution[i-1] = 0;
    }
    return false;
  }

  private static int[] getAvailable(int i) {
    int row = getRow(i), column = getColumn(i), subgrid = getSubGrid(i);
    int[] available = new int[]{1,2,3,4,5,6,7,8,9};

    for (int k = 0; k < sideLength; k++) {
      if (rows[row-1][k]) available[k] = 0;
      if (columns[column-1][k]) available[k] = 0;
      if (subGrids[subgrid-1][k]) available[k] = 0;
    }

    return available;
  }

  private static void mark(int i, int value, boolean ret) {
    int row = getRow(i), column = getColumn(i), subgrid = getSubGrid(i);

    rows[row-1][value-1] = ret;
    columns[column-1][value-1] = ret;
    subGrids[subgrid-1][value-1] = ret;
  }

  private static int[] createPuzzle(int[] solution) {
    int[] puzzle = new int[gridLength];
    int[] mask = new int[gridLength];

    do {
      fillPuzzle(solution, puzzle, mask);
    } while (!hasSingleSolution(puzzle));

    return puzzle;
  }

  private static void fillPuzzle(int[] solution, int[] puzzle, int[] mask) {
    System.arraycopy(solution, 0, puzzle, 0, gridLength);
    for (int i = 0; i < gridLength; i++) mask[i] = i;
    RandomUtil.shuffle(mask);
    for (int i = 0; i < 50; i++) puzzle[mask[i]] = 0;
  }

  private static boolean hasSingleSolution(int[] puzzle) {
    for (int i = 1; i <= gridLength; i++) if (puzzle[i-1] != 0) mark(i, puzzle[i-1], true);
    int countOfSolution = solve(puzzle, 1, 0);
    for (int i = 1; i <= gridLength; i++) if (puzzle[i-1] != 0) mark(i, puzzle[i-1], false);

    return countOfSolution == 1;
  }

  private static int solve(int[] puzzle, int i, int countOfSolution) {
    if (i == gridLength+1) return ++countOfSolution;
    if (puzzle[i-1] != 0) return solve(puzzle, i+1, countOfSolution);

    int[] available = getAvailable(i);

    for (int k : available) {
      if (k == 0) continue;

      puzzle[i-1] = k;
      mark(i, k, true);
      countOfSolution = solve(puzzle, i+1, countOfSolution);
      mark(i, k, false);
      if (countOfSolution > 1) return countOfSolution;
      puzzle[i-1] = 0;
    }
    return countOfSolution;
  }

  // todo: compute difficulty
  public static double computeDifficulty(int[] puzzle) {
    return 0.0;
  }
}
