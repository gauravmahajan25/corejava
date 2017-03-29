package afi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortListStrings {
	
	public static void main (String [] args) {
		List <String> inputList = new ArrayList<>();
		inputList.add("gaurav");
		inputList.add("ads");
		inputList.add("saurav");
		inputList.add("bre");
		
		//System.out.println(sortStringsAlpha(inputList));
		
		for (String str : inputList) {
			System.out.println(str);
			inputList.add("Foreach");
			
		}
 	}

	public static List<String> sortStringsAlpha(List<String> list) {
		
		/*Comparator cmp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				
				return ((String)o1).compareTo((String) o2);
			}
		};*/
		//list.sort((s1, s2) -> s1.compareTo(s2));
		
		list.sort(new ComparatorExample());

		return list;

	}

	



}
