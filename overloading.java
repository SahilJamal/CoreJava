class overloading
{
	public void dis(String name)
	{
	System.out.println("The name of employee is: "+name);
	}
	public void dis(int id, double salary)
	{
	System.out.println("The id of employee is: "+id);
	System.out.println("The salary of employee is: "+salary);
	}
	public void dis(String address,String mob)
	{
	System.out.println("The address of employee is: "+address);
	System.out.println("The mobile number of employee is: "+mob);
	}
	public static void main(String args[])
	{
	overloading ob=new overloading();
	ob.dis("sahil");
	ob.dis(101,120987.123);
	ob.dis("ghatkopar","7304192478");
	}
}