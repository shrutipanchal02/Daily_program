package map;

import java.util.TreeMap;

public class treemapFirstEntry {
	public static void main(String[] args) {
		TreeMap t =new TreeMap();
		t.put(1, "aaa");
		t.put(2, "bbb");
		t.put(3, "ccc");
		System.out.println(t);
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
	}
}
