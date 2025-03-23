package map;

import java.util.TreeMap;

public class treesetSubmap {
	public static void main(String[] args) {
		TreeMap t =new TreeMap();
		t.put(1, "aaa");
		t.put(2, "bbb");
		t.put(3, "ccc");
		t.put(4, "eee");
		System.out.println(t);
		System.out.println(	t.subMap(2, 4));
	}
}
