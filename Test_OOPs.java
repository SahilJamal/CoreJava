class Test_OOPs
{
	public void Display()
	{
	System.out.println("This is non static method");
	}
	public static void display()
	{
	System.out.println("This is static method");
	}
	public static void main(String args[])
	{
		Test_OOPs obj=new Test_OOPs(); // here obj is your refernce and "new Test()" is your object 
		obj.Display();//to call method funtion
		Test_OOPs.display();
	}
}