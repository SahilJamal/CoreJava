import java.util.*;
class Hotel
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int qty,rate,total;
char choice ;
double c;
String name;
System.out.println("\n##########   Enter your name  ##########\n");
name=sc.next();
System.out.println("\n======================= welcome to Hotel Nasir=======================\n");
System.out.println("\n ==*===Select Item from Menu===*== ");
System.out.println("\n1.Sandwiches \n2.Pizza \n3.Burgers \n4.Chicken and eggs");
choice = sc.next().charAt(0);
System.out.println("\n===================================================================\n");
switch(choice)
{
case '1':
System.out.println("You have selected Sandwiches ");
System.out.println("\n########## If you take this in quantity more than 5 you get a special disscount of 20% ##########\n");
System.out.println("Enter the quantity ");
qty = sc.nextInt();
if(qty > 5)
{
	rate = 25;
    total = qty*rate;
	c= total - (0.2*total) + (0.05*total);
System.out.println("\n====================================");
System.out.println("\n##########\n"+name+"\n##########\n");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
else
{
	rate = 25;
    total = (qty*rate) ;
	c=total+ (0.05*total);
	System.out.println("\n====================================");
	System.out.println("\n##########\n"+name+"\n##########\n");
	System.out.println("You dont get any special discount");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
break;
case '2':
System.out.println("You have selected Pizza ");
System.out.println(" \n ############If you take this in quantity more than 5 you get a special disscount of 20%########### \n");
System.out.println("Enter the quantity ");
qty = sc.nextInt();
if(qty > 5)
{
	rate = 120;
    total = qty*rate;
	c=total - (0.2*total)+(0.05*total);
System.out.println("\n====================================");
System.out.println("\n##########\n"+name+"\n##########\n");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
else
{
	rate = 120;
    total = qty*rate;
	c=total+(0.05*total);
	System.out.println("\n====================================");
	System.out.println("You dont get any special discount");
	System.out.println("\n##########\n"+name+"\n##########\n");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
break;
case '3':
System.out.println("You have selected Burgers ");
System.out.println("\n ############If you take this in quantity more than 5 you get a special disscount of 20%########## \n");
System.out.println("Enter the quantity ");
qty = sc.nextInt();
if(qty > 5)
{
	rate = 150;
    total = qty*rate;
	c=total - (0.2*total)+(0.05*total);
System.out.println("\n====================================");
System.out.println("\n##########\n"+name+"\n##########\n");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
else
{
	rate = 150;
    total = (qty*rate);
	c=total+(0.05*total);
	System.out.println("\n====================================");
	System.out.println("\n##########\n"+name+"\n##########\n");
	System.out.println("You dont get any special discount");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
break;
case '4':
System.out.println("You have selected Chicken and eggs ");
System.out.println("\n #######If you take this in quantity more than 5 you get a special disscount of 20%######## \n");
System.out.println("Enter the quantity ");
qty = sc.nextInt();
if(qty > 5)
{
    rate = 200;
    total = qty*rate;
	c=total - (0.2*total)+(0.05*total);
System.out.println("\n====================================");
System.out.println("\n##########\n"+name+"\n##########\n");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
else
{
	rate = 150;
total = (qty*rate);
   c=total+(0.05*total);
	System.out.println("\n====================================");
	System.out.println("\n##########\n"+name+"\n##########\n");
	System.out.println("You dont get any special discount");
System.out.println("This is the rate "+rate+"\nYour Total Amount with gst : " + c);
System.out.println("\n====================================");
}
break;
default:
System.out.println("xxxx=== Sorry Unavailabe ===xxxx");
return;
}
}
}
