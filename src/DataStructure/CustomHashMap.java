package DataStructure;
import java.util.concurrent.ConcurrentHashMap;

public class CustomHashMap<K, V> {

	ConcurrentHashMap<K, V> chm;
	Entry<K, V>[] table;

	private int capacity = 5;

	public CustomHashMap() {
		table = new Entry[capacity];
	}

	public void put(K key, V value) {

		// calculate hash for the new key
		int hash = hash(key);

		// create new Entry object
		Entry<K, V> newEntry = new Entry(key, value, null);

		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];

			while (current != null) {
				if (current.key.equals(newEntry.key)) {
					if (previous == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;

					}
				}

				previous = current;
				current = current.next;
			}

			previous.next = newEntry;
		}

	}

	public V get(K key) {
		int hash = hash(key);

		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> entry = table[hash];
			while (entry != null) {

				if (entry.key.equals(key)) {
					return entry.value;
				}
				
				entry = entry.next;
			}
		}

		return null;
	}
	
	public boolean remove(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return false;
		} else {
			
			Entry previous = null;
			Entry current = table[hash];
			Entry<K, V> entry = table[hash];
			while (current != null) {

				if (current.key.equals(key)) {
					
					if (previous == null) {
						table[hash] = table[hash].next;
						return true;
					} else {
						previous.next = table[hash].next;
						return true;
					}
				}
				
				previous = current;
				current = current.next;
			}

		}
		
		return false;
		
	}

	private int hash(K key) {
		// TODO Auto-generated method stub
		return key.hashCode() % capacity;
	}
}

class Entry<K, V> {

	Entry<K, V> next;
	K key;
	V value;

	Entry(K Key, V value, Entry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}