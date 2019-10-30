package com.Nationwide.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table (name="easyshop")
public class easyShop {
	
 @Id
	
	private String dlist;
	private String meals;
	private String date;
	
	public easyShop () {

}
	public easyShop (String dlist, String meals, String date) {
		this.dlist = dlist;
		this.meals = meals;
		this.date = date;
	}
	

	public String getList() {
		return dlist;
	}

	public void setList(String dlist) {
		this.dlist = dlist;
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
	
	
