class Nestedloop1
{
	public static void main(String args[])
	{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i==2 ||i==4)
			{
				System.out.print("#");
			}
			else if(i==1 || i==3)
			{
				System.out.print("*");
			}
			else if(i==5)
			{
				System.out.print("$");
			}
		}
		System.out.println();
	}
	}
}