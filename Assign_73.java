package strings_assisgnment;

import java.util.Arrays;

public class Assign_73 {
static int spaces=0;
	public static void main(String[] args) {
		String s1="my name is ekta";
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s1.length();i++)
		{
		boolean b3	=Character.isSpaceChar(c[i]);
		
		if(b3==true)
		{
			spaces++;
		}
				
		}
		System.out.println(spaces);

	}

}
