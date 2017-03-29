package afi;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E>{

	E [] arr;
	private int currentIndex;
	
	public ArrayIterator(E [] arr) {
		this.arr = arr;

	}
	
	@Override
	public boolean hasNext() {
		return this.currentIndex < this.arr.length ;
	}

	@Override
	public E next() {
		return arr[currentIndex++];

	}


}
