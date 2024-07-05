package strings_assisgnment;

import java.util.Arrays;
import java.util.Scanner;

public class Exception_Arrays_Strings {
	
	
	

	public static void main(String[] args) {
		
	/*String q="manish";
	for(int i=0;i<q.length()+1;i++)
	{
		
		System.out.println(q.charAt(i));
		
	}as string follows indexing,so total indexing is from 0 to 5 and we are finding char at i from 0to 7 as we dont 
	have value of 6 and 7 we get exception*/
		
	int roll2[]= new int[3];
	roll2[0]=10;
	roll2[1]=20;
	roll2[2]=30;
	try{
		roll2[3]=40;
	}
	catch(ArrayIndexOutOfBoundsException al)
	{System.out.println("handle exception");
	Scanner s1=new Scanner(System.in);
	int roll3= s1.nextInt();
	System.out.println(roll3);
	
	
	}
	finally
	{
		System.out.println("hello world");
		
	}
	
	
		
		
		
		
		

	}

}
