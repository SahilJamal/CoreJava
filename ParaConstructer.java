class ParaConstructer
{
     int /*y,x,*/z;
	  public ParaConstructer()    // overload 
	 {
		 int i=5;
         int j=4;		
		 z=i-j;
		 System.out.println(z);
		 
	 }
	  public  ParaConstructer(int x,int y)
	 {
	 z=y+x;
	 System.out.println(z);
     }
	public static void main(String args[])
	{
		new ParaConstructer();
	    ParaConstructer obj=new ParaConstructer(2,3);
		 
		
	}
}