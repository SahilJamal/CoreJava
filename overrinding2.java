class overrinding1
{
	String name;
	int id;
	public overrinding1(String name,int id)
	{
	this.name=name;
	this.id=id;
	}
	public void dis()
	{
	System.out.println("The name of employee "+name);
	System.out.println("The id of employee is "+id);
	}
}
class overrinding2 extends overrinding1
{
	String address;
	public overrinding2(String name,int id ,String address)
	{
	super(name,id);
	this.address=address;
	}
	public void dis()
	{
	 super.dis();
	 System.out.println("The address of employeeis "+address);
	}
	public static void main(String args[])
	{
	overrinding2 ob=new overrinding2("sahil",101,"andheri");
	ob.dis();
	}
}