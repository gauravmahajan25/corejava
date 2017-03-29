package multithreading;

public class ThreadLocalDemo extends Thread {
	public static void main(String args[]) {
		Thread threadOne = new ThreadLocalDemo();
		threadOne.start();
		Thread threadTwo = new ThreadLocalDemo();
		threadTwo.start();
	}

}
