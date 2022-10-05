package com.cuishuhao.sudokuserver.repository;

import com.cuishuhao.sudokuserver.entity.Sudoku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SudokuRepository extends JpaRepository<Sudoku, Long> {
}