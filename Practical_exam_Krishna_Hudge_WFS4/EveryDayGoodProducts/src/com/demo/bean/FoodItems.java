package com.demo.bean;

import java.util.Date;

public class FoodItems extends GenericItem {

	//Instance variables
	private Date mfgDate;
	private Date expDate;
	private boolean vegetarian;
	
	//Default constructor
	public FoodItems() {
		super();
	}
	
	//Parameterized constructor
	public FoodItems(int itemCode, String itemName, double price, Date mfgDate, Date expDate, boolean vegetarian,
			int quantity) {
		super(itemCode, itemName, price, quantity);
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.vegetarian = vegetarian;
		
	}
	
	//To string method
	public String toString() {
		return super.toString() + "MfgDate:" + mfgDate + "ExpDate:" + expDate + "vegetarin:" + vegetarian;
	}

	//getters and setters
	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	
	


	
	
	
}
