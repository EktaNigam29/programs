package revision_daily;

import java.util.Enumeration;
import java.util.Vector;

public class Assign7 {

	public static void main(String[] args) {
	Vector v=new Vector();
	v.add("ekta");
	v.add("sita");
	v.add("mita");
	v.add("kriti");
	System.out.println(v);
	Enumeration e=	v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}

	}

}
