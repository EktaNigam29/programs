package learning_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class List_behaviour {

	public static void main(String[] args) {
		List a1=new ArrayList();//upcasting
		//check indexing(yes)
	    a1.add(90);
		a1.add(45);
		a1.add(60);
		a1.add(75);
		System.out.println(a1);
		//accepts dulpicate value(yes)
		a1.add(90);
		a1.add(90);
		System.out.println(a1);
		//accepts null(yes)
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		//Accepts iterator(yes)
		Iterator l1=	a1.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
			
		}
		//acceptes ListIterator(yes)
	ListIterator n2=	a1.listIterator();
	while(n2.hasNext())
	{
		System.out.println(n2.next());
		
	}
	while(n2.hasPrevious())
	{
		System.out.println(n2.previous());
		
	}
	}

}
