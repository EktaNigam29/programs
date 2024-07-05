package learning_collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class Assign110_111_112 {

	public static void main(String[] args) {
		LinkedList a1= new LinkedList();
		a1.add("Ram");
		a1.add("Sita");
		a1.add("Nita");
		a1.add("Rita");
		System.out.println(a1);
		
		a1.addFirst("Ekta");
		System.out.println(a1);
		a1.addLast("Abhi");
		System.out.println(a1);
		a1.removeFirst();
		a1.removeLast();
		
		System.out.println(a1);
	
		 System.out.println(a1.getFirst());
	        System.out.println(a1.getLast());
	        System.out.println(a1.pollFirst());
	        System.out.println(a1.pollLast());
			
		
		
		
		Iterator a2=	 a1.iterator();
		
		while(a2.hasNext())
		{
			System.out.println(a2.next());
		}
		
		
		ListIterator a3=	a1.listIterator();
		while(a3.hasNext())
		{
			System.out.println(a3.next());
		}
		
		
		while(a3.hasPrevious())
		{
			System.out.println(a3.previous());
		}
		
		


	}

}
