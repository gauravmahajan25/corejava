package DataStructure;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap FailSafe Iterator example.
 * @author Gaurav M
 *
 */
public class ConcurrentHashMapFailSafeIteratorExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		chm.put("1", "One");
		chm.put("2", "two");
		chm.put("3", "three");
		
		Iterator iterator = chm.keySet().iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			chm.put("4", "four");
			
			
		}
		
		
		

	}

}
