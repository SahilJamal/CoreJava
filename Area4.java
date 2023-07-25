import java.util.*; 
class Rectangle //(OPPs inheritence)(super keyword)
{
	int l,b;
	public void Rectangle()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of rectangle: ");
	l=sc.nextInt();
	System.out.println("Enter the breath of rectangle: ");
	b=sc.nextInt();
	}
}
class Area4 extends Rectangle //(extends is what defining the class A)
{
	public void Area4()
	{
	super.Rectangle();//(from this we can avoid making two object)
	int a;
	a=l*b;
	System.out.println("The Area of rectangle is: "+a);
	}
	public static void main(String args[])
	{
	Area4 obj=new Area4();
	obj.Area4();
	}
}