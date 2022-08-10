package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MylDemoAppApplication {
	
	

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MylDemoAppApplication.class, args);
		FoodItemService service = context.getBean(FoodItemService.class);
		service.getFoodItems().forEach(System.out::println);
	}

}
