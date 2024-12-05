package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListmethods {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(57);
		l1.add(69);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(34);
		l2.add(57);
		l2.add(69);
		l1.addAll(l2);//2ndmethod
		System.out.println(l1);
		List<Object> l3=new ArrayList<Object>();
		l3.add(34);
		l3.add("Apple");
		l3.add(true);
		l3.set(1, "grapes");
		for(Object x : l3)
		{
			System.out.println(x);
		}
System.out.println(l3.get(1));//set and get method

//contains and retainsall
ArrayList<String> l4=new ArrayList<String>();
l4.add("mango");
l4.add("Apple");
l4.add("banana");
Collections.sort(l4);
System.out.println(l4);
Collections.shuffle(l4);
System.out.println(l4);
Collections.reverse(l4);
System.out.println(l4);
//System.out.println(l4.contains("mango"));

ArrayList<String> l5=new ArrayList<String>();
l5.add("kiwi");
l5.add("grapes");
l5.add("banana");
//System.out.println(l4.contains("mango"));
/*l4.retainAll(l5);//will give common elements
for(String x:l4)
{
	System.out.println(x);
}*/
	l4.removeAll(l5);//will remove common elements
	System.out.println("after removing");
	for(String y:l4)
	{
		System.out.println(y);
	}


	}

}
