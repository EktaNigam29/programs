package learning_collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
public class Set_behaviour {

	public static void main(String[] args) {
		Set n1=new TreeSet();//upcasting
		//check indexing(no)
	   n1.add(90);
		n1.add(45);
		n1.add(60);
		n1.add(75);
		System.out.println(n1);
		//accepts dulpicate value(no)
				n1.add(90);
				n1.add(90);
				System.out.println(n1);
				//accepts null(no)-it gives NullPointerException
				//n1.add(null);
				//n1.add(null);
				//System.out.println(n1);
				n1.add("ekta");
				n1.add("abhi");
				n1.add("alia");
				n1.add("samaira");
			Collections.sort(n1);
			System.out.println(n1);
				Iterator l2=	n1.iterator();
				//Accepts iterator(yes)
				while(l2.hasNext())
				{
					System.out.println(l2.next());
					
				}
				//acceptes ListIterator(no)
				//not getting ListIterator method of list interface.
				
		


	}

}
