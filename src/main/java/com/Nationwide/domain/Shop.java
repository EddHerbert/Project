package com.Nationwide.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity


public class Shop {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private String list;
	private String meals;
	private String date;
	
	public Shop (String list, String Meals, String Dates) {

}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
	
	
