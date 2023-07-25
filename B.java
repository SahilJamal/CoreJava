class A //(OPPs inheritence)
{
	public void disA()
	{
	System.out.println("This is parent class");
	}
}
class B extends A //(extends is what defining the class A)
{
	public void disB()
	{
	System.out.println("This is child class");
	}
	public static void main(String args[])
	{
	B obj=new B();
	obj.disA();
	obj.disB();
	}
}