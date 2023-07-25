import java.util.*;
class Hotel1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int qty,rate,total,i,n=0;
char choice ;
System.out.println("=======================WELCOME TO NASIR HOTEL =======================");
System.out.println("\n ==*===Select Item from Menu===*==");
for(i=0;i<=1;i++)
{
		if(n<=i)
		{
			   if(n<=1)
				{
							System.out.println("\n menu \n \n1.COFFEE \n2.TEA \n3.COLD COFFEE \n4.MILK SHAKE\n5.JUICE\n");
							choice = sc.next().charAt(0);
							System.out.println("\n===================================================================\n");
							switch(choice)
							{
							case '1':
							System.out.println("You have selected Coffee. \n Enter the quantity : ");
							qty = sc.nextInt();
							rate = 25;
							total = qty*rate;
							System.out.println("\n====================================");
							System.out.println("\n Total Amount : " + total);
							System.out.println("\n====================================");
							break;
							case '2':
							System.out.println("You have selected Tea. \n Enter the quantity : ");
							qty = sc.nextInt();
							rate = 5;
							total = qty*rate;
							System.out.println("\n====================================");
							System.out.println("\n Total Amount : " + total);
							System.out.println("\n====================================");
							break;
							case '3':
							System.out.println("You have selected Cold Coffee. \n Enter the quantity : ");
							qty = sc.nextInt();
							rate = 45;
							total = qty*rate;
							System.out.println("\n====================================");
							System.out.println("\n Total Amount : " + total);
							System.out.println("\n====================================");
							break;
							case '4':
							System.out.println("You have selected Milk Shake. \n Enter the quantity : ");
							qty = sc.nextInt();
							rate = 50;
							total = qty*rate;
							System.out.println("\n====================================");
							System.out.println("\n Total Amount : " + total);
							System.out.println("\n====================================");
							break;
							case '5':
							System.out.println("You have selected Juice . \n Enter the quantity : ");
							qty = sc.nextInt();
							rate = 15;
							total = qty*rate;
							System.out.println("\n====================================");
							System.out.println("\n Total Amount : " + total);
							System.out.println("\n====================================");
							break;
							default:
							System.out.println("xxxx=== Sorry Unavailabe ===xxxx");
							return;
							}
				}						
				 System.out.println("Do you want anything else");
				 System.out.println("\n1:Yes\n2:No");
				 n=sc.nextInt();
		}
else 
{
	System.out.println("Thank you for your purchse");
}	
}

         
}
}

