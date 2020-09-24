package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.bean.GenericItem;
import com.demo.comparator.MyQuantityComparator;

//Author:Krishna Hudge
//Description:Handles all the data related activities and returns back the control to service layer

public class ProductDaoImpl implements ProductDao {

	// Declaring arraylists for respective items
	static List<GenericItem> foodList=null;
	static List<GenericItem> apparelList=null;
	static List<GenericItem> electronicsList=null;
	
	// Creating arraylists objects for respective items
	static {
		foodList = new ArrayList<>();
		apparelList = new ArrayList<>();
		electronicsList = new ArrayList<>();
	}
	
	//adds product to the respective array list
	@Override
	public void addProduct(GenericItem item, int choice) {
		if(choice == 1)				//Add to the food list
			foodList.add(item);
		else if(choice==2)			//Add to the apparel list
			apparelList.add(item);
		else						//Add to the electronicsList
			electronicsList.add(item);
	}

	//Sorts in descending order of quantity for food items
	@Override
	public List<GenericItem> sortOnQuantityFood() {
		Collections.sort(foodList, new MyQuantityComparator());
		return foodList;
	}

	//Sorts in descending order of quantity for apparel items
	@Override
	public List<GenericItem> sortOnQuantityApparel() {
		Collections.sort(apparelList, new MyQuantityComparator());
		return apparelList;
	}

	//Sorts in descending order of quantity for electronics items
	@Override
	public List<GenericItem> sortOnQuantityElectronics() {
		Collections.sort(electronicsList, new MyQuantityComparator());
		return electronicsList;
	}

}
