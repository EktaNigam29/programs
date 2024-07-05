package strings_assisgnment;

import java.util.ArrayList;

public class Assisgn101 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ekta");//add objects and print values in form of arrays.
		a1.add("abhi");
		a1.add(67);
		a1.add(null);
		a1.add('a');
		System.out.println(a1);
		System.out.println(a1.remove("ekta"));
		ArrayList a2=new ArrayList();
	a2.addAll(a1);//stores all a1 values
	a2.add("alia");
	System.out.println(a2.removeAll(a1));
	System.out.println(a2);
	System.out.println(a2.containsAll(a1));//true
	System.out.println(a2.isEmpty());//false
	ArrayList a3=new ArrayList();
	System.out.println(a3.isEmpty());//true
	System.out.println(a2.size());
	ArrayList a4=new ArrayList();
	a4.add("rita");
	a4.add("rita");
	a4.add("rita");
	a4.add("rita");
	System.out.println(a4);
	a4.clear();
	System.out.println(a4);//empty array
	
		
		
		
		
		
		
		
		

	}

}
