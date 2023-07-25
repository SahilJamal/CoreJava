class C //(OPPs inheritence)(super keyword)
{
	int x;
	public void disC()
	{
	x=5;
	System.out.println("This is parent class");
	}
}
class D extends C //(extends is what defining the class A)
{
	public void disD()
	{
	super.disC();//(from this we can avoid making two object)
	System.out.println("The value of x is: "+x);
	}
	public static void main(String args[])
	{
	D obj=new D();
	obj.disD();
	}
}