package strings_assisgnment;

import java.util.Arrays;

public class Assign79_80 {

	public static void main(String[] args) {
		
int rollno[]=new int[5];
rollno[0]=10;
rollno[1]=20;
rollno[2]=30;
rollno[3]=40;
rollno[4]=50;

int copied1[]=new int[rollno.length];
for(int i=0;i<rollno.length;i++)
{
	copied1[i]=rollno[i];

}
System.out.println(Arrays.toString(copied1));
System.out.println(Arrays.toString(rollno));

boolean e=Arrays.equals(rollno, copied1);
if(e==true)
{
	System.out.println("they are equal");
}
else
{
	System.out.println("they are not equal");
}









}
	
	
}
