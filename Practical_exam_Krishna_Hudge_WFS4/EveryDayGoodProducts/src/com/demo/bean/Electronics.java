package com.demo.bean;

public class Electronics extends GenericItem {
	
	//Instance variables
	private int warranty;
	
	//Default constructor
	public Electronics() {
		super();
	}

	//Parameterized constructor
	public Electronics(int itemCode, String itemName, double price, int warranty, int quantity) {
		super(itemCode, itemName, price, quantity);
		this.warranty = warranty;
		
	}
	
	//To string method
	public String toString() {
		return super.toString() + "MfgDate:" + "warranty:" + warranty;
	}

	//getters and setters
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	

}
