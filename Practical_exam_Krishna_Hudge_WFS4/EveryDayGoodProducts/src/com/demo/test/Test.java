package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.bean.GenericItem;
import com.demo.exception.InvalidQuantityException;

public class Test {

	public static void main(String[] args) {
		
		ProductService productService = new ProductServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter 1. Fooditems 2. Apparel 3. Electronics");
		try {
			productService.addProduct(choice);
		}catch(InvalidQuantityException exception) {
			System.out.println(exception.getMessage());
		}
		
		
		List<GenericItem> foodList = productService.sortOnQuantityFood();
		for(int i=0;i<3;i++) {
			System.out.println(foodList.get(i));
		}
		List<GenericItem> apparelList = productService.sortOnQuantityApparel();
		for(int i=0;i<3;i++) {
			System.out.println(apparelList.get(i));
		}
		List<GenericItem> electronicsList = productService.sortOnQuantityElectronics();
		for(int i=0;i<3;i++) {
			System.out.println(electronicsList.get(i));
		}
		
	}
}
