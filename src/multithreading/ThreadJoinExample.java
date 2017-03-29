package multithreading;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		
		JoinRunnable joinExample = new JoinRunnable();
		
		Thread joinThreadOne = new Thread(joinExample);
		
		Thread joinThreadTwo = new Thread(joinExample);
		
		System.out.println("Inside main before starting join");
		joinThreadOne.start();
		
		joinThreadTwo.start();
		joinThreadTwo.join();
		
		joinThreadOne.join();
		
		
		System.out.println("Inside main after starting join");
		
			}
}

class JoinRunnable implements Runnable {
	AtomicInteger counter = new AtomicInteger(0);

	@Override
	public void run() {
		System.out.println("Inside Join Runnable run mehtod == "+counter.incrementAndGet());
		
	}
	
}
