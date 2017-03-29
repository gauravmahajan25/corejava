package afi;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashSetA {

	HashMap hm = new HashMap();

	@Override
	public boolean equals(Object obj) {
		Collections.unmodifiableMap(hm);

		Collections.unmodifiableList(new ArrayList<>());

		EnumSet e1;

		return false;
	}

	private int hashcode() {
		return 1;
	}
	
	public static void main(String args[]) {
		B1 question = new B1();
		question.method((String) null);
	}

}

class A1 {
	protected void test() {

	}
}

class B1 extends A1 {

	@Override
	public void test() throws RuntimeException {

	}

	public void method(Object o) {
		System.out.println("Object Verion");
	}

	public void method(String s) {
		System.out.println("String Version");
	}

	public void method(StringBuffer s) {
		System.out.println("String Buff Version");
	}
	
}

class D1<T extends A, B, B1> {

}

enum Apple {
	  A(10), B(9), C(12), D(15), E(8);

	  private int price; // price of each apple 

	  // Constructor 
	  Apple(int p) {
	    price = p;
	  }

	  Apple(){
		  
	  }
	  
	  int getPrice() {
	    return price;
	  }
	}