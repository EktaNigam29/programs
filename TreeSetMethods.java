package practise;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		TreeSet<Integer> t1= new TreeSet<Integer>();
		t1.add(45);
		t1.add(65);
		t1.add(90);
		t1.add(95);
		t1.add(100);
		t1.add(190);
		System.out.println(t1);
		/*Iterator<Integer> itr=	t1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		System.out.println(t1.descendingSet());//reverse order
		System.out.println(t1.headSet(95,true));//print value till 95
		System.out.println(t1.headSet(95,false));//print value till 95 exclude 95
		System.out.println(t1.tailSet(95,true));//print value from 95
		System.out.println(t1.tailSet(95,false));//print value from 95 exclude 95
		System.out.println(t1.subSet(45,true, 190, false));//print value from 45 till 100 as 190 is excluded
		System.out.println(t1.subSet(45,false, 190, false));//print value from 65 till 190 as 45 and 190 are excluded
		
		

	}

}
