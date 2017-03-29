package afi;
import java.util.Arrays;

public class TestMessage {
	
	public static void main(String[] args) {
		Message message = new Message();
		
		int [] arr = message.getPrivateValues();
		
		arr[2] = 5;
		System.out.println(Arrays.toString(arr));
	}

}
