package map;

import java.util.TreeMap;

public class treesetReplace {
	public static void main(String[] args) {
		TreeMap t =new TreeMap();
		t.put(1, "aaa");
		t.put(2, "bbb");
		t.put(3, "ccc");
		System.out.println(t);
		t.replace(3,"ddd");
		System.out.println(t);
	}
}
