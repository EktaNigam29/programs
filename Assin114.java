package learning_collection;

import java.util.Vector;

public class Assin114 {

	public static void main(String[] args) {
		Vector s1=new Vector();
		s1.addElement("ekta");
		s1.addElement("abhi");
		s1.addElement("lalit");
		s1.addElement("annie");
		s1.addElement("mamta");
		
		
		System.out.println(s1);
		int capacity=s1.capacity();
		System.out.println(capacity);
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		s1.removeElement("ekta");
		System.out.println(s1);
		s1.removeElementAt(1);
		System.out.println(s1);
		//System.out.println(s1.capacity());
		s1.removeAllElements();
		System.out.println(s1);

	}

}
