package revision_daily;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Assign6 {

	public static void main(String[] args) {
		List a1=new LinkedList();
		a1.add("ekta");
		a1.add("mita");
		a1.add("veena");
		a1.add("abhi");
		System.out.println(a1);
		a1.add("seema");
		a1.add("seema");
		System.out.println(a1);
		a1.add("null");
		a1.add("null");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);//ascending
		/*Iterator a2=		a1.iterator();
		while(a2.hasNext())
		{
			System.out.println(a2.next());
		}*/

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
