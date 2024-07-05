package practiseanswers;

import java.util.Arrays;

public class Assign18  {
static int k=0;

public static void main(String[] args) {
	
	int roll[]= {10,20,30,40,50};
	int roll1[]=new int[roll.length];
	for(int i=4;i>=0;i--)
	{
		 roll1[i]=roll[k];
		 k++;
		
	}
	
	System.out.println(Arrays.toString(roll));
	System.out.println(Arrays.toString(roll1));
	
}
}