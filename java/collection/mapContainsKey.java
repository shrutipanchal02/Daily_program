package map;

import java.util.HashMap;
import java.util.Map;

public class mapContainsKey {
	public static void main(String[] args) {

		Map map= new HashMap();
		map.put(101, "shruti");
		map.put(102, "malvika");
		map.put(103, "siddhi");
		map.put(104,"pragati");
		System.out.println(map);
		System.out.println(map.containsKey(101));// this method used to check particular key contain or not and return boolean value
		System.out.println(map.containsValue("pragati"));
}
}
