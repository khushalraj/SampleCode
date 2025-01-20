package CollectionsExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Khushal");
		map.put(2, "Omkar");
		map.put(3, "Mayur");
		System.out.println("beofre call remove() method" + map);
		map.remove(3);
		System.out.println("After call remove() method" + map);
		map.put(2, "Omkar Patil");
		System.out.println("After call remove() method" + map);
		System.out.println("getting value by key:"+map.get(1));
	}
}
