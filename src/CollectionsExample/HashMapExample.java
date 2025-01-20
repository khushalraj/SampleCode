package CollectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	Map<String, Double> map = new HashMap<String, Double>();
	map.put("Khushal", 9012.31);
	map.put("Shubham", 401.12);
	map.put("Sowham", 900.1);
	
	Set<Entry<String,Double>> set = map.entrySet();
	for(Map.Entry<String,Double> me:set){
		System.out.println(me.getKey());
		System.out.println(me.getValue());
	}
}
}
