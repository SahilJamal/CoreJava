package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap();
		map.put(2, "Divyesh");
		map.put(1, "Javed");
		map.put(3, "Sahil");
		map.put(3, "Pratiksha");
		
//		System.out.println(map);
		
		for(Entry<Integer, String> data: map.entrySet()) {
			System.out.println(data.getKey()+"="+data.getValue());
		}
		
		System.out.println(map.get(1));
		
		System.out.println(map.containsKey(1));
	}
	
}
