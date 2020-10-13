package pk;
class Employee
{
	String name="AB",city="pune";;
	int age=20;
	public void display()
	{
		System.out.println("Name Of Employee is:" +name);
		System.out.println("Age Of Employee is:" +age);
		System.out.println("city Of Employee is:" +city);
	}
}
public class EmpDemo 
{

	public static void main(String[] args) 

	{
		Employee e=new Employee();
		e.display();
		Employee e1=new Employee();
		e1.display();
		
	}

}
