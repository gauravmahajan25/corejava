package afi;

import java.util.Comparator;

public class ComparatorExample implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((String)o1).compareTo((String) o2);
	}

}
