class table1   //mohd sahil
{
	public static void main (String arg[])
	{        
			int i,j;
		for(i=1;i<=10;i++)
		{
			for(j=2;j<=10;j++)
			{
				if((i*j)<=9)
				{
				System.out.print(" "+i*j+"  ");
				}
				else
				{
					System.out.print(i*j+"  ");
				}
			}
			System.out.println();
		}
	}
}