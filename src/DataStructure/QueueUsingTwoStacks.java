package DataStructure;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingTwoStacks {
	
	private Stack<String> stack1;
	private Stack<String> stack2;
	
	public QueueUsingTwoStacks() {
		stack1 = new Stack<String>();
		stack2 = new Stack<String>();
	}
	
	public void moveStack1toStack2() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public String peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		
		if(stack2.isEmpty()){ 
			moveStack1toStack2();
		}
		return stack2.peek();
	}
	
	public void enQueue(String t) {
		stack1.push(t);
	}

	public String deQueue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is Empty");
		}
		if (stack2.isEmpty()) {
			moveStack1toStack2();
		}
		return stack2.pop();
	}

}
