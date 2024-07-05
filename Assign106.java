package learning_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assign106 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ekta");//add objects and print values in form of arrays.
		a1.add("abhi");
		a1.add(67);
		a1.add(null);
		a1.add('a');
		System.out.println(a1);
		
		ListIterator i2=	a1.listIterator();
		/*while(i2.hasNext())
			
		{
			System.out.println(i2.next());//forward
		}*/
while(i2.hasPrevious())
			
		{
			System.out.println(i2.previous());//backward
		}
	}

}
