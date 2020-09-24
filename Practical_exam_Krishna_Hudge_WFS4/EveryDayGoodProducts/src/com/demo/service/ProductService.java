package com.demo.service;

import java.util.List;

import com.demo.bean.GenericItem;
import com.demo.exception.InvalidQuantityException;

public interface ProductService {

	void addProduct(int choice) throws InvalidQuantityException;


	List<GenericItem> sortOnQuantityFood();


	List<GenericItem> sortOnQuantityApparel();


	List<GenericItem> sortOnQuantityElectronics();

}
