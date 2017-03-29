package multithreading;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadTasksSnippets {
	
	public static void main(String[] args) {
		Executor exe = new Executor() {
			
			@Override
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	static void handleRequest(Socket connection) {
		// TODO Auto-generated method stub
		
	}

}


class TaskExecutionWebServer {
	
	private static final int NO_OF_THREADS = 100;
	private static final Executor executor = Executors.newFixedThreadPool(NO_OF_THREADS);
	
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(80);
		while (true) {
			final Socket connection = socket.accept();
			Runnable task = new Runnable() {
				public void run() {
					ThreadTasksSnippets.handleRequest(connection);
				}
			};
			executor.execute(task);
		}
	}
}



class ThreadPerTaskWebServer {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(80);
		while (true) {
			final Socket connection = socket.accept();
			Runnable task = new Runnable() {
				public void run() {
					ThreadTasksSnippets.handleRequest(connection);
				}
			};
			new Thread(task).start();
		}
	}
}




class SingleThreadWebServer {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(80);
		while (true) {
			Socket connection = socket.accept();
			ThreadTasksSnippets.handleRequest(connection);
		}
	}
	
	
	
		
}