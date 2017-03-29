package multithreading;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HiddenIterator {
	// @GuardedBy("this")
	private final Set<Integer> set = new HashSet<Integer>();

	public synchronized void add(Integer i) {
		set.add(i);
	}

	public synchronized void remove(Integer i) {
		set.remove(i);
	}

	/**
	 * The addTenThings method could throw ConcurrentModificationException,
	 * because the collection is being iterated by toString in the process of
	 * preparing the debugging message. Of course, the real problem is that
	 * HiddenIterator is not thread-safe; the HiddenIterator lock should be
	 * acquired before using set in the println call, but debugging and logging
	 * code commonly neglect to do this. The real lesson here is that the
	 * greater the distance between the state and the synchronization that
	 * guards it, the more likely that someone will forget to use proper
	 * synchronization when accessing that state. If HiddenIterator wrapped the
	 * HashSet with a synchronizedSet, encapsulating the synchronization, this
	 * sort of error would not occur.
	 */
	public void addTenThings() {
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			add(r.nextInt());
		System.out.println("DEBUG: added ten elements to " + set);
	}
}