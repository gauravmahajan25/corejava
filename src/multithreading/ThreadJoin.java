package multithreading;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MyRunnable(), "T1");
		Thread t2 = new Thread(new MyRunnable(), "T2");
		Thread t3 = new Thread(new MyRunnable(), "T3");
		
		t1.start();
		
		//start second thread after 2 seconds of first thread
		
		t1.join(2000);
		
		t2.start();
		
		
		//start third thread when first thread is dead
		t1.join();
		t3.start();
		
		t1.join(); 
		t2.join();
		t3.join();
		
		System.out.println("All Threads are done!");

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Started = "+Thread.currentThread().getName());		
	}
	
}
