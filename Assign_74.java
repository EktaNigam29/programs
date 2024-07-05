package strings_assisgnment;

import java.util.Arrays;

public class Assign_74 {
static int count=0;
static int letters=0;
static int spaces=0;




	public static void main(String[] args) {
		
String name1="my name is ekta 12346789 @#$%^";
System.out.println(name1.length());

 

char c2[]=name1.toCharArray();
System.out.println(Arrays.toString(c2));

for(int i=0;i<name1.length();i++)
{
	
	boolean b=Character.isDigit(c2[i]);
	boolean b4=Character.isLetter(c2[i]);
	boolean b5=Character.isSpaceChar(c2[i]);
	
	if(b==true)
	{
		count++;
	}
	if(b4==true)
	{
		letters++;
	}
	if(b5==true)
	{
		spaces++;
	}
	

}

System.out.println("The count of numeric digits " +count);
System.out.println("The count of alphabets "+letters);
System.out.println("The count of spaces "+spaces);
int characters= name1.length()-(count+letters+spaces);
System.out.println("The number of special character " +characters);


	}















	}


