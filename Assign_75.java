package strings_assisgnment;

import java.util.Arrays;

public class Assign_75 {

	public static void main(String[] args) {
		String s1="ekta";
		String s2="tkea";
		boolean b=s1.equals(s2);
		System.out.println(b);
		
		if(s1.length() !=s2.length())
		{
			System.out.println("it is not an anagram");
		}
			
		else
		{
			System.out.println("Eligible to become an anagram will see ");
			char b5[]=s1.toCharArray();//Converting string into arrays
			char b1[]=s2.toCharArray();
			Arrays.sort(b1);//sorting in alphabetical order
			Arrays.sort(b5);
			System.out.println(Arrays.toString(b1));//print in array form
			System.out.println(Arrays.toString(b5));
			boolean g=Arrays.equals(b5, b1);
			if(g==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not an anagram");
			}
			
		}

		
	}

}
