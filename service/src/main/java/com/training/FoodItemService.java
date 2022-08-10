package com.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

	@Autowired
	JdbcTemplate template;
	
	public List<FoodItem> getFoodItems(){
		return this.template.query("select * from food_items",new BeanPropertyRowMapper<>(FoodItem.class) );
	}
}
