import java.util.*;
class StudentDemo
{
	int  rollNum, mark1, mark2, mark3, totalMarks;
        String studName;
    public String StudDetails(String studName)
    {
	return studName;
	}
	public int StudDetails1(int rollNum)
	{
	 return rollNum;
	}
	public int calculateTotal(int mark1,int mark2,int mark3)
	{
		
	    totalMarks=mark1+mark2+mark3;
	    return totalMarks;
	}
	public static void main(String args[])
	{
		int  rollNum, mark1, mark2, mark3, totalMarks;
        String studName;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		studName=sc.next();
		System.out.println("Enter the roll number of student:");
		rollNum=sc.nextInt();
		System.out.println("Enter your mark1");
		mark1=sc.nextInt();
		System.out.println("Enter your mark2");
		mark2=sc.nextInt();
		System.out.println("Enter your mark3");
		mark3=sc.nextInt();
	StudentDemo obj=new StudentDemo();
	String i=obj.StudDetails(studName);
	System.out.println("The name of student is: "+i);
	int j=obj.StudDetails1(rollNum);
	System.out.println("The roll number of student is: "+j);
	if(mark1<=100&&mark2<=100&&mark3<=100)
		{
	int k=obj.calculateTotal(mark1,mark2,mark3);
	System.out.println("The total marks of student is: "+k);
		}
		else
		{
		 System.out.println("marks is invalid ");	
		}
	   }