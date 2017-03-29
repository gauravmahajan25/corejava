package afi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializaableExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5057374850587937790L;
	int rollNo;
	String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void writeObject() throws IOException {
		SerializaableExample obj = new SerializaableExample();
		obj.setRollNo(102);
		obj.setName("Gaurav");
		
		FileOutputStream fos = new FileOutputStream("C:\\Gaurav\\sample.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
	}
	
	
	public static void readObject() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Gaurav\\sample.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializaableExample obj = (SerializaableExample) ois.readObject();
		
		System.out.println(obj.getName()+ " " + obj.getRollNo());
	}
	
	public static void main(String [] as) throws IOException, ClassNotFoundException {
		//writeObject();
		readObject();
		
	}
}
