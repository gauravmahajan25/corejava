package afi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Day8 {

	public static void main (String [] args) {
		HashMap<String, Integer> phoneBook = new HashMap<>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.get(s) != null) {
        		System.out.println(s+"="+phoneBook.get(s));
        	} else {
        		System.out.println("Not found");
        	}
        }
        in.close();
        
	}
}
