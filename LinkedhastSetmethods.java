package practise;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhastSetmethods {

	public static void main(String[] args) {
		Set<Integer> s1= new LinkedHashSet<Integer>();
		s1.add(23);
		s1.add(67);
		s1.add(77);
		s1.add(88);
		s1.add(99);
		System.out.println(s1);//follows order of insertion

	}

}
