package multithreading;

public class TaskRunnable implements Runnable {
	
	private int taskId;
	TaskRunnable(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {

		System.out.println("Task ID : "+this.taskId +" performed by "+ Thread.currentThread().getName());

	}

}
