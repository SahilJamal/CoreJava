class lihas extends Thread
{
	public void run()
	{   int i;
		char[] a={'W','E','L','C','O','M','E'};
		for (i=0;i<a.length;i++) {	
		     
			System.out.print(a[i]);
			try
			{
				sleep(1500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
        }
	}
	 public void finalize()
	 {
		 
	 }
}
class threading{
	public static void main(String args[])
	{
		lihas ob=new lihas();
		while(0)
		{
		ob.start();
		ob.finalize();
		}
	}
}