package DataStructure;

public class LinkedListExample {
	
}


class LinkedList<T> {
	private Node<T> head;

	private static int size;
	
	public int getSize() {
		return size;
	}
	
	private static void incrementSize(){
		size++;
	}
	
	private static void decrementSize(){
		size--;
	}

	//Add Elements to the end of List
	public void add(T data) {


		//if head is null initialize the head node
		if (head == null) {
			head = new Node<>(data);
		}
		
		Node<T> tempNode = new Node<>(data);
		Node<T> currentNode = head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(tempNode);
		incrementSize();
	}
	
	//Add Elements to the specific index of the list 
	
	public void add(T data, int index) {
		Node<T> tempNode = new Node<>(data);
		Node currentNode = head;
		
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);

		incrementSize();
	}
	
	
	//Return the element at specific index in list
	
	//remove element from list
	
	
	//implement toString
}




class Node<T> {
	private T data;
	private Node next;
	
	public Node(){
		this(null, null);
	}
	
	public Node(T data) {
		this(data, null);
	}
	
	public Node(T data, Node next) {
		this.next = next;
		this.data = data;
	}
	
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
