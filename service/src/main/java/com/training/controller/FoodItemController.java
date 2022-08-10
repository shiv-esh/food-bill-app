package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.FoodItem;
import com.training.FoodItemService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/api")
public class FoodItemController {
	
	@Autowired
	FoodItemService service;
	
	
	@GetMapping("/fooditem")
	public List<FoodItem> getFoodItem(){
		return service.getFoodItems();
	}

}
