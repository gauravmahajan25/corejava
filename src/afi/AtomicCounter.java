package afi;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter {
	
	private AtomicLong count = new AtomicLong(0);
	
	public void increment() {
		boolean updated = false;
		
		while (!updated) {
			long oldValue = count.get();
			updated = count.compareAndSet(oldValue, oldValue + 1);
		}
	}
	
	public long count() {
		return this.count.get();
	}

}
