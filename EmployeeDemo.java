package pk;
import java.util.*;
class EmpDetaitl
{
	Scanner sc=new Scanner(System.in);
	String e_name;
	int dob,mob,yob;
	double e_month_Salary,yearSalary,tax;
	public void Display_EmpDetail()
	{
		System.out.println("Enter Employee Name:");
		e_name=sc.nextLine();
		System.out.println("Enter Employee Date of birth:");
		dob = sc.nextInt();
		mob = sc.nextInt();
		yob = sc.nextInt();
		System.out.println("Enter Employee monthlysalary:");
		e_month_Salary=sc.nextInt();
		yearSalary=e_month_Salary*12;
		
		if(yearSalary>=500000)
		{
			tax = (yearSalary*20)/100;
		}
		else if(yearSalary>=400000)
		{
			tax =(yearSalary*15)/100;
		}
		else if(yearSalary>=300000)
		{
			tax =(yearSalary*10)/100;
		}
		else if(yearSalary>=200000)
		{
			tax = (yearSalary*5)/100;
		}
		else
		{
			System.out.println("Emplyee dont need to pay tax");
		}
		System.out.println("************Detail of Employee*********");
		System.out.println("Name of Employee:" +e_name);
		//System.out.println("Date of Birth of Employee:"+dob/+mob/+yob);
		System.out.println("Employee Birth date : "+dob+"/"+mob+"/"+yob);
		System.out.println("Salary of Employee:"+e_month_Salary);
		System.out.println("Annual Salary of employee"+yearSalary);
		System.out.println("Employee tax on salary:"+tax);
	}
}

public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		EmpDetaitl ed=new EmpDetaitl();
		ed.Display_EmpDetail();
	}

}
