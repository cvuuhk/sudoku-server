package com.cuishuhao.sudokuserver.common;

public class SudokuUtil {

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

    return builder.append("+-----+-----+-----+\n").toString();
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

  // todo: compute difficulty
  public static double computeDifficulty(int[] puzzle) {
    return 0.0;
  }
}
