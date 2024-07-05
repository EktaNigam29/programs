package strings_assisgnment;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_70_Arrays {
	static Scanner s1=new Scanner(System.in);

	public static void main(String[] args) {
		
/*int rollno[]=new int[5];
rollno[0]=s1.nextInt();
rollno[1]=s1.nextInt();
rollno[2]=s1.nextInt();
rollno[3]=s1.nextInt();
rollno[4]=s1.nextInt();

for(int i=0;i<rollno.length;i++)
{
	rollno[i]=s1.nextInt();
}

System.out.println(Arrays.toString(rollno));*/

int rollno1[] = new int[s1.nextInt()];//5
for(int i=0;i<rollno1.length;i++)
{
	rollno1[i]=s1.nextInt();
}

System.out.println(Arrays.toString(rollno1));


	}

}
