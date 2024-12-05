package practise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListmethods {

	public static void main(String[] args) {
		LinkedList<Object> l1= new LinkedList<Object> ();
		l1.add("Guava");
		l1.add(false);
		l1.add(34);
		l1.add(56.45f);
		//System.out.println(l1);
		l1.addFirst("Ekta");
		l1.addLast("eku");
		l1.add(4, "nigam");
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		
		Iterator itr=	l1.descendingIterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		

	}

}
