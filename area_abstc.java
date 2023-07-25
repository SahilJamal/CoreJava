abstract class area1234
{
	public abstract double dis(double r);
}
class circle extends area1234
{
	public double dis(double r)
	{
		double a;
		a=3.14*r*r;
		return a;
	}
}
class square extends area1234
{
	public double dis(double r)
	{
		double a;
		a=r*r;
		return a;
	}
}
public class area_abstc {

	public static void main(String args[])
	{
	  area1234 ob;
	  
	  ob=new circle();
	  double x=ob.dis(2);
	  System.out.println("area of circle is "+x);
	  
	  ob=new square();
	  double y=ob.dis(5);
	  System.out.println("area of square is "+y);
	}
}
