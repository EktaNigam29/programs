package strings_assisgnment;

import java.util.Arrays;

public class Assign_71 {
static int count=0;
	public static void main(String[] args) {
		String s1="50cents";
		char c1[]=s1.toCharArray();//conversion of String into arrays
		System.out.println(Arrays.toString(c1));
	
		
		
		for(int i=0;i<s1.length();i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			
		if(b1==true)
		{
			count++;
			
		}
		
		
		}
		
		System.out.println("the count of numeric digits is " +count);
		
		if(count>0)
		{
			System.out.println("string has digits");
		}
		
		
		
          
	
	
	
	
	}
}
	
	
	


