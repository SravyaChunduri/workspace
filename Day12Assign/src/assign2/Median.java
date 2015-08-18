package assign2;

import java.util.Arrays;

public class Median {
	
	public int i=0;
	public int median;
	
	public int[] a=new int[4];
	
	public int[] copy(int arr[])
	{
	a[0]=arr[arr.length-1];
	
	for(i=0;i<arr.length-1;i++)
	{
		a[i+1]=arr[i];
		
	}
	System.out.println("Values after Copying one element to right");
	for(i=0;i<arr.length;i++)
	{
		System.out.println(a[i]);
	}
	return a;
	}
	
	public int medianVal(int a1[])
	{
		
		Arrays.sort(a);
		
		if(a.length%2==0)
		{
			median=(a[(a.length/2)-1]+a[((a.length/2)+1)-1])/2;
		}
		else
		{
			median=a[(a.length)/2];
		}
		
		return median;
	}

	public static void main(String[] args) {
		
		System.out.println("Helloo!!!");
		
		

	}

}
