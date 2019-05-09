package com.ipbase.DataBack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ipbase.DataBack.dao")
public class DatabackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabackApplication.class, args);
	}

}
