class ControlStatement
{
	public static void main(String args[])
	{
	int i;
	for(i=1;i<=100;i++)
	{
    if(i==11)
	{
		break;
	}
	if(i%2==0)
	{
	continue;
	}
	/*if(i<=11)
	{
		break;
	}*/
	/*if(i>=11)
	{
		break;
	}*/
	
	System.out.println(i);
	}
	}
}