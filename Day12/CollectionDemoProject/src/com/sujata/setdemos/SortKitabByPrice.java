package com.sujata.setdemos;

import java.util.Comparator;

public class SortKitabByPrice implements Comparator<Kitab> {

	@Override
	public int compare(Kitab kitab1, Kitab kitab2) {
		if(kitab1.getPrice()>kitab2.getPrice())
			return 1;
		else if(kitab1.getPrice()<kitab2.getPrice())
			return -1;
		else if(kitab1.equals(kitab2))
			return 0;
		return 1;
	}

}
