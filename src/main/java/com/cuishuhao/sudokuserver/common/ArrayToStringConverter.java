package com.cuishuhao.sudokuserver.common;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ArrayToStringConverter implements AttributeConverter<int[], String> {
  @Override
  public String convertToDatabaseColumn(int[] grid) {
    return SudokuUtil.convertToString(grid);
  }

  @Override
  public int[] convertToEntityAttribute(String dbData) {
    return SudokuUtil.convertToArray(dbData);
  }
}
