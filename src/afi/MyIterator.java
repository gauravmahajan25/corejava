package afi;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class MyIterator<E> implements Iterator<E> {
	
	private E [] elements;
	private AtomicInteger currentIndex;
	
	public MyIterator(E [] elements) {
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		return currentIndex.get() < this.elements.length;
	}

	@Override
	public E next() {

		if (this.hasNext()) {
			return this.elements[currentIndex.getAndIncrement()];
		}
		
		return null;
	}

}
