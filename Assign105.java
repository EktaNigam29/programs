package learning_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Assign105 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ekta");//add objects and print values in form of arrays.
		a1.add("abhi");
		a1.add(67);
		a1.add(null);
		a1.add('a');
		System.out.println(a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())//if the iteration has more elements
		{
			System.out.println(i1.next());//the next element in the iteration
		}

	}

}
