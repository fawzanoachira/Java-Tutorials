package hashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap h = new LinkedHashMap();
		h.put("name", "sreeraj");
		h.put("age", "17");
		h.put("address", "tvm");
		h.put("name", "ajay");
		
		System.out.println(h);
		
		for(Object key:h.keySet()) {
			Object value = h.get(key);
			System.out.println("Key: "+key+" Value: "+value);
		}
	}
}
