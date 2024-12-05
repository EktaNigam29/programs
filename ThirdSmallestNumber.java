package practise;

public class ThirdSmallestNumber {
	public static int Thirdlargest(int [] a, int total)
	{
	int temp;
		for(int i=0; i<total;i++)
		{
			for(int j=i+1; j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[3-1];//3rd smallest number
	}

	public static void main(String[] args) {
		
		int [] a= {12,67,3,8,19,44,33};
		System.out.println(Thirdlargest(a,7));
	}

}
