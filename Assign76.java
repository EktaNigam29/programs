package strings_assisgnment;

public class Assign76 {
static double sum=0;
static double average=0;

	public static void main(String[] args) {
		
int rollno[]=new int[4];
rollno[0]=19;
rollno[1]=33;
rollno[2]=17;
rollno[3]=2;
//rollno[4]=60;

for(int i=0; i<rollno.length;i++)
{
	sum=sum+rollno[i];
}
System.out.println(sum);
average=sum/rollno.length;
System.out.println(average);

}

}
