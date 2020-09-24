package com.demo.dao;

import java.util.List;

import com.demo.bean.GenericItem;

public interface ProductDao {

	void addProduct(GenericItem item, int choice);


	List<GenericItem> sortOnQuantityFood();


	List<GenericItem> sortOnQuantityApparel();


	List<GenericItem> sortOnQuantityElectronics();

}
