package com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.GenericItem;

//comparator for descending sort according to quantity
public class MyQuantityComparator implements Comparator<GenericItem> {

	@Override
	public int compare(GenericItem o1, GenericItem o2) {
		if(o1.getQuantity() < o2.getQuantity())
			return -1;
		else if(o1.getQuantity() == o2.getQuantity())
			return 0;
		else
			return 1;
	}

}
