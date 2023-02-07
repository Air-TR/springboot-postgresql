package com.tr.springboot.postgresql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试类在 --> SpringbootPostgresqlApplicationTests
 */
@MapperScan("com.tr.springboot.postgresql.mapper")
@SpringBootApplication
public class SpringbootPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlApplication.class, args);
	}

}
