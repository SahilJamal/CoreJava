class DefConstructer
{
     int y,x,z;
	  public  DefConstructer()
	 {
	 x=3;
	 y=4;
	 z=y+x;
	 System.out.println(z);
     }
	public static void main(String args[])
	{
	    DefConstructer obj=new DefConstructer();
	}
}