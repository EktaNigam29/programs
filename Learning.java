package practise;

public class Learning {
	
	
	public static int number(int[]a,int total )
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//return a[total-5];
		return a[2-1];
	}

	public static void main(String[] args) {
		
int a[]= {12,52,65,79,88,90,100,150};
System.out.println(number(a, 8));
	}

}
