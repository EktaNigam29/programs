package strings_assisgnment;

import java.util.Arrays;

public class Practice3 {
static int count =0;
static int letters =0;
static int spaces=0;
	public static void main(String[] args) {

String name="my name is ekta 1234 @#$%";
System.out.println(name.length());
char c[]=name.toCharArray();
//System.out.println(Arrays.toString(c));
for(int i=0; i<name.length();i++)
{
	boolean m=Character.isDigit(c[i]);
	boolean m2=Character.isLetter(c[i]);
	boolean m3=Character.isSpaceChar(c[i]);
	
	if (m==true)
	{
		count++;
	}
	
	if (m2==true)
	{
		letters++;
	}
	if (m3==true)
	{
		spaces++;
	}
}

System.out.println(count);
System.out.println(letters);
System.out.println(spaces);
int special_characters=name.length()-(count+letters+spaces);
System.out.println(special_characters);
	}

}
