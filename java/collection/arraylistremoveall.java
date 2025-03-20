package collection;

import java.util.ArrayList;

public class arraylistremoveall {
	public static void main(String[] args) {
		   ArrayList al = new ArrayList();
		        al.add(100);
		        al.add("shruti");
		        al.add('c');
		        
		        System.out.println(al);     
		        
		        ArrayList al2 = new ArrayList();
		        al2.add(100);
		        al2.add("ganu");
		        al2.add('s');

		        System.out.println(al2);     
		        
		        al.removeAll(al2);
		        System.out.println(al);   
		        }
			}


