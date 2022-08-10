package com.training;

public class FoodItem {

	private int item_id;
	private String item_name;
	private int item_cost;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_cost() {
		return item_cost;
	}

	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}

	@Override
	public String toString() {
		return "FoodItem [item_id=" + item_id + ", item_name=" + item_name + ", item_cost=" + item_cost + "]";
	}

}
