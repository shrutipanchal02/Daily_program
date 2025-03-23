package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmapput {
public static void main(String[] args) {
	HashMap map= new HashMap();
	map.put(1, "sss");
	map.put(2, "kkk");
	map.put(3, "ppp");
	map.put(4, "mmm");
	System.out.println(map);
	Set set=map.entrySet();
	//System.out.println(set);
    Iterator itr= set.iterator();
    	while (itr.hasNext()) {
		
    		System.out.println(itr.next());
		}
  
}
}
