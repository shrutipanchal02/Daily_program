package stack;

import java.util.Stack;

public class stackPop {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("sss");
		s.push(100);
		s.push('a');
		s.push(10.9);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}

