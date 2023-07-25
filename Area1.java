import java.util.*;
class Area1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int length,breath,side;
	double Radius,total;
	char choice ;
	System.out.println("Enter your choice \n A:Area of Circle \n B:Area of Rectangle \n C:Area of Sqaure \n D: exit ");
	choice=sc.next().charAt(0);
	switch(choice)
		{
		case 'A':
		System.out.println("Enter the radius of circle");
		Radius=sc.nextInt();
		total=3.14*Radius*Radius;
		System.out.println("The area of circle is "+total);
		break;
		case 'B':
		System.out.println("Enter the length of rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breath of rectangle");
		breath=sc.nextInt();
		total=length*breath;
		System.out.println("The area of rectangle is "+total);
		break;
		case 'C':
		System.out.println("Enter the side of square");
		side=sc.nextInt();
		total=side*side;
		System.out.println("The area of square is "+total);
		break;
		case 'D':
		break;
		default:
		System.out.println("invalid");
		return;
	}
}
}