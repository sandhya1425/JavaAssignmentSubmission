package pk;

import java.util.Scanner;

class AvengerDemo
{
	Scanner sc=new Scanner(System.in);
	int age,power,weapon,planet;
	String name;
	public void getDetails()
	{
		System.out.println("Enter the Name ");
		name=sc.nextLine();
		System.out.println("Enter the Age ");
		age=sc.nextInt();
		System.out.println("Enter the power ");
		power=sc.nextInt();
		System.out.println("Enter the weapon ");
		weapon=sc.nextInt();
		System.out.println("Enter the planet");
		planet=sc.nextInt();
		
	}
	public void displayDetails()
	{
		System.out.println("Name of Avenger:"+name);
		System.out.println("Age of Avenger:"+age);
		System.out.println("power of Avenger:"+power);
		System.out.println("weapon of Avenger:"+weapon);
		System.out.println("planet of avenger:"+planet);
		
	}
}
public class Avenger 
{

	public static void main(String[] args) 
	{
		int i;
		AvengerDemo[] ad=new AvengerDemo[5];
		for(i=0;i<5;i++)
		{	
			ad[i]=new AvengerDemo();
			ad[i].getDetails();
		}
		for(i=0;i<5;i++)
		{	
			ad[i].displayDetails();
		}
	}

}
