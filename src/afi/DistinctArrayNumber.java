package afi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctArrayNumber {
	
	public static void main(String[] args) {
		
		Integer [] arr = {1,1,2,3,4,5,5,5,5,5,5,5,6,777,777};
		
		for (int index=0; index < arr.length; index++) {
			
			if (index+1 < arr.length && arr[index] != arr[index+1]) {
				//System.out.println(arr[index]);
				continue;
			} 
			if (index == arr.length-1) {
				//System.out.println(arr[index]);
			}	
		}
		
		//Solution2
		LinkedHashSet<Object> set = new LinkedHashSet<>(Arrays.asList(arr));
		//set.addAll(set, arr);
		
			

		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
