package treeMap;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(101, 'a');
		t.put(102, 'b');
		t.put(107, 'c');
		t.put(103, 'd');
		t.put(104, 'e');
		
		for(Object key:t.keySet()) {
			Object value = t.get(key);
			System.out.println("Key : "+key+" Value: "+value);
		}
	}
}
