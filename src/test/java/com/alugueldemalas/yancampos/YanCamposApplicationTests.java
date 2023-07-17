package com.alugueldemalas.yancampos;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class YanCamposApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(YanCamposApplicationTests.class, args);
	}

}
