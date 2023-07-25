import java.util.Scanner;
class PhotoCopy_test
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of copies printed: ");
		int n = s.nextInt();
		
		float price,totalprice;
		if(n<100 && n>=0)
		{
			price=0.30f;
			System.out.println("Per copy price is $"+price);
			totalprice=n*price;
			System.out.println("Total price for printing "+n+" copies is $"+totalprice);
		}
		else if(n>=100 && n<500)
		{
			price=0.28f;
			System.out.println("Per copy price is $"+price);
			totalprice=n*price;
			System.out.println("Total price for printing "+n+" copies is $"+totalprice);
		}
		else if(n>=500 && n<800)
		{
			price=0.27f;
			System.out.println("Per copy price is $"+price);
			totalprice=n*price;
			System.out.println("Total price for printing "+n+" copies is $"+totalprice);
		}
		else if(n>=800 && n<1000)
		{
			price=0.26f;
			System.out.println("Per copy price is $"+price);
			totalprice=n*price;
			System.out.println("Total price for printing "+n+" copies is $"+totalprice);
		}
		else
		{
			price=0.25f;
			System.out.println("Per copy price is $"+price);
			totalprice=n*price;
			System.out.println("Total price for printing "+n+" copies is $"+totalprice);
		}
	}
}