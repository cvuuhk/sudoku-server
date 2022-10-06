package com.cuishuhao.sudokuserver;

import com.cuishuhao.sudokuserver.common.SudokuUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class SudokuServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SudokuServerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> SudokuUtil.createSudoku().print();
	}
}
