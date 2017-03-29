package DataStructure;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapCaseInSensistive extends HashMap<String, String> {
	
	@Override
	public String put(String key, String value) {
		// TODO Auto-generated method stub
		return super.put(key.toLowerCase(), value);
	}
	
	/*@Override
	public String get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key.toString().toLowerCase());
	}*/

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMapCaseInSensistive();
		map.put("One", "1");
		map.put("one", "11");
		map.put("one", "222");
		map.put("three", "3");
		//map.put("one", "111");
		
		System.out.println(map);


		/*for (Entry<String, String> entry : map.entrySet()) {
			
			System.out.println("Key == "+ entry.getKey() + "value == "+entry.getValue());
		}*/
		
		
		//Using TreeMap
		 Map<String, String> treeMap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		 treeMap.put("abc", "abc");
		 treeMap.put("xyz", "xyz");
		 treeMap.put("ABC", "ABC");

		  System.out.println(treeMap);
	}

}
