package multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NoVisibility {
	private static boolean ready;
	private static int number;
	
	List list = new ArrayList();
	List l2 = Collections.synchronizedList(list);

	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready)
				Thread.yield();
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside main");
		new ReaderThread().start();
		number = 42;
		ready = true;
	}
}
