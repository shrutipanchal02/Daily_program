package stack;

import java.util.Stack;

public class stackpeek {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("sss");
		s.push(100);
		s.push('a');
		s.push(10.9);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}
}


