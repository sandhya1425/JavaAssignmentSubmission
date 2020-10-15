package pk;

import java.util.Scanner;

class SumOfArrayDemo
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5],i,sum;
	public void sumCalculation()
	{
		System.out.println("Enter the Array Element:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Element:"+sum);
	}
}
public class SumOfArray {

	public static void main(String[] args) 
	{
		SumOfArrayDemo sd=new SumOfArrayDemo();
		sd.sumCalculation();

	}

}
