import java.util.*;
class ArrayClaculator
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,c;
	char choice;
	int a[]=new int[2];
	System.out.println("Enter numbers ");
	for(i=0;i<2;i++)
	{
	a[i]=sc.nextInt();
	}
	for(i=0;i<1;i++)
			{
			System.out.println("enter your choice:\n+\n-\n*\n%");
			choice=sc.next().charAt(0);
			switch(choice)
			   {
				case '+': 
					c=a[0]+a[1];
					System.out.println("your addition is "+c);
					break;
				case '-': 
					c=a[0]-a[1];
					System.out.println("your subtraction is "+c);
					break;
				case '*': 
					c=a[0]*a[1];
					System.out.println("your multipication is "+c);
					break;
				case '%':
					 c=a[0]%a[1];
					 System.out.println("your modulus value is "+c);
				default:
					{
					System.out.println("invalid");
					}
						
	           }
			}
	}
}