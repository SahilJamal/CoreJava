import java.util.*;
class Armstrong1
{
	public static void main(String args[])
	{
	int sum=0,r,i=100,a;
	a=i;
	for(i=100;i<=1000;i++)
	{
		while(i!=0)
		{
		r=i%10;
		sum=sum+r*r*r;
		i=i/10;
		}
		if(a==sum)
		{
		System.out.println("The number is Armstrong");
		}
		System.out.println("Armstrong number"+sum);
		break;
	}
	}
	}
