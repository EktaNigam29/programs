package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_ArrayList {

	public static void main(String[] ags) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(57);
		l1.add(69);
		//1st way of traversing
		for(Integer x : l1)
		{
			System.out.println(x);
		}
		//2nd way of traversing
		System.out.println(l1);
		//3rd way of traversing
		Iterator<Integer> i1=	l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
