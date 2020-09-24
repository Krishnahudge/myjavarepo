package com.demo.bean;

public class Apparel extends GenericItem {
	
	//Instance variables
	private String size;
	private String material;
	
	//Default constructor
	public Apparel() {
		super();
	}

	//Parameterized constructor
	public Apparel(int itemCode, String itemName, double price, String size, String material, int quantity) {
		super(itemCode, itemName, price, quantity);
		
		this.size = size;
		this.material = material;
		
	}
	
	//To string method
	public String toString() {
		return super.toString() + "MfgDate:" + "size:" + size + "material:" + material;
	}

	//getters and setters
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
