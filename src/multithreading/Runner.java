package multithreading;

public class Runner implements Runnable {

	private int counter;

	@Override
	public void run() {
		try {
			for (int i = 0; i != 2; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + counter++);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Runner r = new Runner();
		Thread t1 = new Thread(r);

		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
		
		Strider s = new Strider("test");
		s.start();
	}

}

class Strider extends Thread {
	private int counter;

	Strider(String name) {
		super(name);
	}

	public void run() {
		try {
			for (int i = 0; i != 2; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + counter++);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}