package pk;
import java.util.*;
class StudDemo
{
	int sub1,sub2,sub3,sub4,sub5;
	float per,total;
	Scanner sc=new Scanner(System.in);
	public void calculate_Stud_Grade()
	{
		System.out.println("Enter the Sub1,Sub2,Sub3,sub4,Sub5 marks:");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Subject marks:" +total);
		per=(total/500)*100;
		System.out.println("percentage of student:" +per);
		if(per>= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(per>= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(per>= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(per>= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(per>= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	}
}
public class Studmark 
{
	public static void main(String[] args) 
	{
		StudDemo sd=new StudDemo();
		sd.calculate_Stud_Grade();
	}
}
