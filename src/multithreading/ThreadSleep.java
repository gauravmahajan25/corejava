package multithreading;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();

		Thread.sleep(2000);
		
		System.out.println("Thread after sleep = "+(System.currentTimeMillis()-start));
	}

}
