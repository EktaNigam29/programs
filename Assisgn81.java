package strings_assisgnment;

import java.util.Arrays;

public class Assisgn81 {
	static int k=0;
	public static void main(String[] args) {
		int roll[]= {15,34,56,67,88};
		int rollcopy[]=new int[roll.length];

		for(int i=roll.length-1; i>=0;i--)
		{
		rollcopy[i]=roll[k];
		k++;
		}


		System.out.println(Arrays.toString(roll));
		System.out.println(Arrays.toString(rollcopy));
		
		
		
		
		
		
		
		
	}

}
//case 1 k=0 i=4  15
//case 2 k=1 i=3  34
//case 3 k=2 i=2  56
//case 4 k=3 i=1  67
//case 5 k=4 i=0  88