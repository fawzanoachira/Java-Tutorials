package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(100, "sreeraj");
		h.put(102, "ajay");
		h.put(103, "mithun");
		h.put(104, "akhil");
		h.put(105, "nithin");
//		System.out.println(h);
		
//		System.out.print(h.keySet()+" ");
//		System.out.print(h.values()+" ");
//		System.out.println(h.entrySet());
//		System.out.println();
//		System.out.println(h.containsKey(100));
//		System.out.println(h.containsValue("ajay"));
		
//		for(Object key:h.keySet()) {
//			Object value = h.get(key);
//			System.out.println("Key: "+key+" Value: "+value);
//		}
//		for(Object value:h.values()) {
//			System.out.println(value);
//		}
		
//		for(Map.Entry<Integer,String> entry:h.entrySet()) {
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println("Key: "+key+" Value: "+value);
//		}
		
		Set entrySet = h.entrySet();
		for(Object i:entrySet) {
			System.out.println(i);
		}
	}
}
