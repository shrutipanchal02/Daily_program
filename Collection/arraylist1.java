package collection;
import java.util.ArrayList;
public class arraylist1{
	public static void main(String[] args) {
   ArrayList al = new ArrayList();
        al.add(100);
        al.add("shruti");
        al.add('c');
        
        System.out.println(al);     

        System.out.println(al.contains(150));
        
        ArrayList al2 = new ArrayList();
        al2.add(200);
        al2.add("ganu");
        al2.add('s');

        System.out.println(al2);     
       
        
        al.addAll(al2);
        System.out.println(al);   
        }
	}


