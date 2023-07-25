class This
{
     int y,x,z;
	  public This()    // 
	 {
		 int i=5;
         int j=4;		 
		 z=i-j;
		 System.out.println(z);
		 
	 }
	  public  This(int x,int y)
	 {
	 this.x=x;
	 this.y=y;
	 z=y+x;
	 System.out.println(z);
     }
	 public void finalize()
	 {
	 System.out.println("destroy object");
	 }
	public static void main(String args[])
	{
		This obj=new This(2,3);
		new This();
		obj.finalize();
	}
}