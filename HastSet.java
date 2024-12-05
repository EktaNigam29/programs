package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HastSet {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(23);
		s1.add(67);
		//s1.add(67);
		s1.add(99);
		s1.add(101);
		s1.add(183);
		s1.add(74);
		System.out.println(s1);//random order and ignore duplicate elements
		
		Set<Integer> s2=new HashSet<Integer>();
		s1.add(123);
		s1.add(167);
		s1.add(167);
		s1.add(99);
		s1.add(101);
		s1.addAll(s2);
		System.out.println(s1);//AUB-it will print duplicate elements once
		//A-B removeall
		//s1.removeAll(s2);
		//System.out.println(s1);
		//s1.retainAll(s2);
		//System.out.println(s1);
		//set to an array
		Object [] obj=s1.toArray();
		System.out.println(Arrays.toString(obj));
		boolean flag=s1.contains(67);
		System.out.println(flag);
		s1.remove(67);
		System.out.println(s1);
		//s1.clear();
		//System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.isEmpty());
		
		
		

	}

}
