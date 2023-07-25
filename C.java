class B //(OPPs inheritence)(super keyword)
{
	public void disB()
	{
	System.out.println("This is parent class");
	}
}
class C extends B //(extends is what defining the class A)
{
	public void disC()
	{
	super.disB();//(from this we can avoid making two object)
	System.out.println("This is child class");
	}
	public static void main(String args[])
	{
	C obj=new C();
	obj.disC();
	}
}