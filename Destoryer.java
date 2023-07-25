class Destoryer
{
     int /*y,x,*/z;
	  public void finalize()
	 {
	 System.out.println("destroy object");
	 }
	  public Destoryer()    // 
	 {
		 int i=5;
         int j=4;		 
		 z=i-j;
		 System.out.println(z);
		 
	 }
	  public  Destoryer(int x,int y)
	 {
	 z=y+x;
	 System.out.println(z);
     }
	public static void main(String args[])
	{
		Destoryer obj=new Destoryer(2,3);
		obj.finalize();
		new Destoryer();
	}
}