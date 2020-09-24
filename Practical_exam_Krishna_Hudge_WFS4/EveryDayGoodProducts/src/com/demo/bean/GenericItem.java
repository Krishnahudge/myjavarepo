package com.demo.bean;

public class GenericItem {
	
	//Instance variables
	private int itemCode;
	private String itemName;
	private double price;
	private int quantity;
	
	//Default constructor
	public GenericItem() {
		super();
	}

	//Parameterized constructor
	public GenericItem(int itemCode, String itemName, double price, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	//To string method
	public String toString() {
		return "Itemcode:" + itemCode + "ItemName:" + itemName + "price" + price + "quantity:" + quantity;		
	}

	//getters and setters
	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
