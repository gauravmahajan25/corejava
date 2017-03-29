package multithreading;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQ {

	private static BlockingQueue sharedQueue = new LinkedBlockingQueue<>();
	private final static int size = 4;

	public static void main() {
		Thread prodThread = new Thread(new Producer11(sharedQueue, size));
		Thread consThread = new Thread(new Consumer11(sharedQueue, size));

		prodThread.start();
		consThread.start();

	}

}

class Producer11 implements Runnable {
	private BlockingQueue<Integer> sharedQueue;
	private int size = 4;

	Producer11(BlockingQueue sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.size = size;
	}

	@Override
	public void run() {

		for (int i = 0; i < size; i++) {

			try {
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

class Consumer11 implements Runnable {
	private BlockingQueue<Integer> sharedQueue;
	private int size = 4;

	Consumer11(BlockingQueue sharedQueue, int size) {
		this.sharedQueue = sharedQueue;
		this.size = size;
	}

	@Override
	public void run() {

		while (true) {
			try {
				sharedQueue.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
