package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.demo.bean.Apparel;
import com.demo.bean.Electronics;
import com.demo.bean.FoodItems;
import com.demo.bean.GenericItem;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.exception.InvalidQuantityException;

//Author:Krishna Hudge
//Desciption:Takes input from user in add method and calls dao layer methods

public class ProductServiceImpl implements ProductService {

	static Scanner sc;
	static SimpleDateFormat sdf;   //Used to parse the string into date object
	static{
		sc = new Scanner(System.in);
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	
	//Creating object of ProductDaoImpl()
	private ProductDao productDao;
	public ProductServiceImpl() {
		this.productDao = new ProductDaoImpl();
	}
	
	//Takes input values and call addProduct method of dao layer
	@Override
	public void addProduct(int choice) throws InvalidQuantityException {
		try {
		System.out.println("Enter item code");
		int itemCode = sc.nextInt();
		System.out.println("Enter item name");
		String itemName = sc.next();
		
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		if(quantity<0)                  //When the quantity<0 then throws exception
			throw new InvalidQuantityException("Quantity can not be a negative value");
		System.out.println("Enter price");
		double price = sc.nextDouble();
		System.out.println("Enter true for vegetarian and false for non vegetarian");
		boolean vegOrNonveg = sc.nextBoolean();

		
		if(choice == 1) {				//choice is food items
			System.out.println("Enter manufacturing date in dd/mm/yyyy");
			String mfg = sc.next();
			System.out.println("Enter expiry date");
			String exp = sc.next();
			try {
				Date mfgDate = sdf.parse(mfg);
				Date expDate = sdf.parse(exp);
				GenericItem item=new FoodItems(itemCode, itemName, price, mfgDate, expDate, vegOrNonveg, quantity);
				productDao.addProduct(item, choice);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(choice == 2) {   		//Choice is apparel item
			System.out.println("Enter size");
			String size = sc.next();
			System.out.println("Enter material type");
			String material = sc.next();
			GenericItem item=new Apparel(itemCode, itemName, price, size, material, quantity);
			productDao.addProduct(item, choice);
		}
		else {     						//choice is electronics item
			System.out.println("Enter warranty in months");
			int warranty = sc.nextInt();
			GenericItem item=new Electronics(itemCode, itemName, price, warranty, quantity);
			productDao.addProduct(item, choice);
		}
		} catch (InvalidQuantityException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

	//calls sortOnQuantityFood() method of dao layer
	@Override
	public List<GenericItem> sortOnQuantityFood() {
		return productDao.sortOnQuantityFood();
	}

	//calls sortOnQuantityApparel() method of dao layer
	@Override
	public List<GenericItem> sortOnQuantityApparel() {
		return productDao.sortOnQuantityApparel();
	}

	//calls sortOnQuantityElectronics() method of dao layer
	@Override
	public List<GenericItem> sortOnQuantityElectronics() {
		return productDao.sortOnQuantityElectronics();
	}

}
