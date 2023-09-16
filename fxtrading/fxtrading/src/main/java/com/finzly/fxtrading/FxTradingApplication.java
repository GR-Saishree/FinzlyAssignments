package com.finzly.fxtrading;


// import statements
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


// Scan the packages where DTOs are located
@SpringBootApplication
@ComponentScan(basePackages = "com.finzly.fxtrading")
public class FxTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxTradingApplication.class, args);
	}

}
