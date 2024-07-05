package strings_assisgnment;

import java.util.Arrays;

public class Assign_72 {
static int letters=0;
	public static void main(String[] args) {
		String name="my name is ekta 98764";
	char c2[]	=name.toCharArray();
	System.out.println(Arrays.toString(c2));
	
	for(int i=0;i<name.length();i++)
	{
		boolean b1=Character.isLetter(c2[i]);
		
		
		if(b1==true)
		{
			letters++;
		}
	}
	
	System.out.println("The letters present are " +letters);
	
	
	

	}

}
