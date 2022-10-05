package com.cuishuhao.sudokuserver.controller;

import com.cuishuhao.sudokuserver.service.SudokuService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sudoku")
public class SudokuController {

  private final SudokuService service;

  public SudokuController(SudokuService service) {
    this.service = service;
  }

}