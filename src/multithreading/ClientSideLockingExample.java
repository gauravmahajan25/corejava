package multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Client-side locking has a lot in common with class extension—they both couple 
 * the behavior of the derived class to the implementation of the base class. 
 * Just as extension violates encapsulation of implementation [EJ Item 14], 
 * client-side locking violates encapsulation of synchronization policy.*/

public class ClientSideLockingExample {

}

class ListHelper<E> {
	public List<E> list = Collections.synchronizedList(new ArrayList<E>());

	public synchronized boolean putIfAbsent(E x) {
		boolean absent = !list.contains(x);
		if (absent)
			list.add(x);
		return absent;
	}
}

class ListHelper2<E> {
	public List<E> list = Collections.synchronizedList(new ArrayList<E>());

	public boolean putIfAbsent(E x) {
		synchronized (list) {
			boolean absent = !list.contains(x);
			if (absent)
				list.add(x);
			return absent;
		}
	}
}