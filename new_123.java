import java.util.Scanner;
class new_123
{
	public int round(double num)
	{
	    double sa=num*100.0;
        double sah=sa/10;
		double s=sah+0.5;
		double sahi=s/10;
		double sahil=sahi+0.45;
		int rs=(int) sahil;
		return rs;
	}
	public static void main(String args[])
	{
		 double num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your decimal number");
		num=sc.nextFloat();
		new_123 obj=new new_123();
		int x=(int)obj.round(num);
		System.out.println("This is your round of value: "+x);
	}
}
