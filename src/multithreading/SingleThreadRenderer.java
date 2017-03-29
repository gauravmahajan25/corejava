package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SingleThreadRenderer {

	public static void main(String[] args) {
		
		/*Ref = new c();
		
		
		A Ref = null;
		
		Ref = new B();
		Ref = new C();
		
		Ref = new D();
		
			
		inter in = new B();
		
		A obj = (A) in;
		
		obj = (B) in;
		*/
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(7);
		list.add(10);
		
		
		NavigableSet set = new TreeSet<>(list);
		
		System.out.println(set.lower(8));
		System.out.println(set.higher(8));
		
		
				
	}

}


class A {
	
}

interface inter {
	
}

class B extends A implements inter {
	
}

class C extends B {
	
}

class E {
	
}