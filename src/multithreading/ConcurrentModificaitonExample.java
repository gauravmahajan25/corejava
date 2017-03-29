package multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificaitonExample {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<>();

		// List<String> list = new ArrayList<>();

		list.add("One");
		list.add("Two");
		list.add("three");

		synchronized (list) {
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				// list.remove("one");
				String value = it.next();
				/*if (value.equals("One")) {
					it.remove();
				}*/
				list.remove("One");
				System.out.println(value);
			}

		}
		System.out.println(list);

	}

}
