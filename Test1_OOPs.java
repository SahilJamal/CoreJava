class Test1_OOPs
{
	public void Display()
	{
	System.out.println("This is non static method");
	}
	public static void display()
	{
	System.out.println("This is static method");
	}
	public void Addition(int a,int b)
	{
		int c=a+b;
		System.out.println("The adittion is "+c);
	}
	public int Subtraction(int d,int e)
	{
		int f;
		f=d-e;
		return f;
	}
	public String Name(String name)
	{
		return name;
	}
	public static void main(String args[])
	{
		Test1_OOPs obj=new Test1_OOPs(); // here obj is your refernce and "new Test()" is your object 
		
		obj.Display();//to call method funtion
		
		Test1_OOPs.display();
		
		obj.Addition(22,22);
		
		int g=obj.Subtraction(22,11);
		System.out.println("Your subtraction is "+g);
		
		String x=obj.Name("sahil");
		System.out.println("The name is "+x);
	}
}