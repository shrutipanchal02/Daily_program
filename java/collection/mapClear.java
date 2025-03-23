package map;

import java.util.HashMap;
import java.util.Map;

public class mapClear {
	public static void main(String[] args) {

		Map map= new HashMap();
		map.put(101, "shruti");
		map.put(102, "malvika");
		map.put(103, "siddhi");
		map.put(104,"pragati");
		System.out.println(map);
	
		map.clear();
		System.out.println(map);
	}
}
