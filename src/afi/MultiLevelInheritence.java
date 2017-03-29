package afi;

public class MultiLevelInheritence {

	public static void main(String [] s) {
		A a = new C ();
		a.test();
	}
}


class A {
	public void test() {
		System.out.println("Inside A");

	}
}


class B extends A {
	public void test() {
		System.out.println("Inside B");

	}
}


class C extends B {
	public void test() {
		System.out.println("Inside C");

	}
	
	
}