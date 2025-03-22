package vector;

import java.util.Vector;

public class vectorremoveElementAt {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("sss");
		v.addElement(100);
		v.addElement(10.2);
		v.addElement("abc ");
		v.addElement(2);
		v.removeElementAt(3);
		System.out.println(v);
	}
	}

