package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetdemo {
	public static void main(String[] args) {
		HashSet hS = new HashSet();
		hS.add("shruti");
		hS.add(10);
		hS.add(10.5);
		hS.add(20);
		System.out.println(hS.contains(10));
            Iterator itr=hS.iterator();
            while (itr.hasNext()) {
			System.out.println(itr.next());
				
			}
	}

}
