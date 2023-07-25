import java.util.*;
class area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a;
int b,h;
System.out.println("Enter the base of triangle ");
b=sc.nextInt();
System.out.println("Enter the hieght of triangle");
h=sc.nextInt();
a=0.5*b*h;
System.out.println("The area of triangle is "+a);

}
}