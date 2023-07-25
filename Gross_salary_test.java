import java.util.*;
class Gross_salary_test
{
	public static void main(String args[])
	{
	double salary,G_salary,DA,HRA;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of employee :");
	name=sc.next();
	System.out.println("Enter your basic salary :");
	salary=sc.nextDouble();
	DA=salary*0.4;
	HRA=salary*0.2;
	G_salary=salary+DA+HRA;
	System.out.println("The name of employee: "+name);
	System.out.println("This is your gross salary: "+G_salary);
	}
}