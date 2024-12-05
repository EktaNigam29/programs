package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListtoArray {

	public static void main(String[] args) {
		ArrayList<Object> l4=new ArrayList<Object>();
		l4.add("mango");
		l4.add("Apple");
		l4.add("banana");
		Object[] obj=l4.toArray();
		System.out.println(Arrays.toString(obj));
		
		//convert Array to ArrayList
		String [] a= {"java","selenium"};
		List a1=Arrays.asList(a);
		System.out.println(a1);
	}

}
