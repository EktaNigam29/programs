package learning_collection;

import java.util.Enumeration;
import java.util.Vector;

public class Program_Enumeration {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("10");
		v.add("ekta");
		v.add("15.23");
		Enumeration e	= v.elements();
		while(e.hasMoreElements())
		{
		System.out.println(e.nextElement());
	
		}
		

	}

}
