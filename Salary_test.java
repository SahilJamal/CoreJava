import java.util.*;
class Salary_test
{
	public static void main(String args[])
	{
	double salary,rate,sal;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of employee");
	name=sc.next();
	System.out.println("Enter the salary of employee");
	sal=sc.nextDouble();
	if(sal<50000 && sal>0)
	{
	salary=sal;
     rate=salary*0;
	System.out.println("The name of employee is: "+name);
	System.out.println("The salary of employee is: "+salary);
	System.out.println("The Incometax rate is: ");
	}
	else if(sal<60000 && sal>50000)
	{
	salary=sal;
	rate=salary*0.1;
	System.out.println("The name of employee is: "+name);
	System.out.println("The salary of employee is: "+salary);
	System.out.println("The Incometax rate is: "+rate);
	}
	else if(sal<150000 && sal>60000)
	{
	salary=sal;
	rate=salary*0.2;
	System.out.println("The name of employee is: "+name);
	System.out.println("The salary of employee is: "+salary);
	System.out.println("The Incometax rate is: "+rate);
	}
	else 
	{
	salary=sal;
	
	rate=salary*0.3;
	System.out.println("The name of employee is: "+name);
	System.out.println("The salary of employee is: "+salary);
	System.out.println("The Incometax rate is: 0 ");
	}
	}
}
