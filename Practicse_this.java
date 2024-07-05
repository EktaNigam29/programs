package strings_assisgnment;

import java.util.LinkedList;

public class Practicse_this {
	


	public static void main(String[] args) {
		
	LinkedList a1=new LinkedList();
		a1.add("sita");
		a1.add("ram");
		a1.add("ramesh");
		a1.add("seema");
		a1.add("simmi");
		System.out.println(a1);
		a1.addFirst("nitu");
		
	a1.addLast("amit");
		
		System.out.println(a1);
		a1.removeFirst();
		System.out.println(a1);
		a1.removeLast();
        System.out.println(a1);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        System.out.println(a1.pollFirst());
        System.out.println(a1.pollLast());
		

	
				
	
		
		
		
	}
	


}
