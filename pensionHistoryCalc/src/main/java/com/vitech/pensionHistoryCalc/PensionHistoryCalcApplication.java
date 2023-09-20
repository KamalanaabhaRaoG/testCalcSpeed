package com.vitech.pensionHistoryCalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vitech.service")
public class PensionHistoryCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionHistoryCalcApplication.class, args);
	}

}
