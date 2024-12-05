package practise;

import java.util.Stack;

public class Stackmethods {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();
		s1.push("Mango");
		s1.push("Orange");
		s1.push("Guava");
		s1.push("Banana");
		System.out.println(s1);
		s1.pop();//will remove last element
		System.out.println(s1);
		//s1.peek();
		//System.out.println(s1);
		

	}

}
