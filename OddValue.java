package pk;
class OddValueDemo
{
	int arr[]={1,2,3,4,5},i;
	public void oddValueCalculation()
	{
		System.out.println("Odd value calculation");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd Number:"+arr[i]);
			}
		}
	}
}
public class OddValue 
{

	public static void main(String[] args) 
	{
		OddValueDemo od=new OddValueDemo();
		od.oddValueCalculation();
	}

}
