package afi;
import java.util.HashSet;

public class TestHashSetB {
	
	public static void main(String[] args) {
		
		HashSet<HashSetB> set = new HashSet<>();
		
		for (int i=0; i <10; i++) {
			set.add(new HashSetB());
		}
		
		System.out.println(set.size());
	}

}
