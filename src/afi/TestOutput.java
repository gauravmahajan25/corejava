package afi;

interface a {
	int i =10;
}

interface b {
	int i =15;
}

public class TestOutput implements a, b {
	
	public static void main(String[] args) {
		System.out.println(b.i);
	}
}
