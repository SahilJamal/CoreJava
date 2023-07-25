package exception;
import java.util.*;
class Banking extends Exception
{
	public Banking()
	{
	super("insufficent balence");
	}
}

public class try_and_catch1 {

	public static void main(String[] args) 
	{
	   int dep,withdrw,blac=10000,choice;
	    Scanner sc=new Scanner(System.in);
		sop("Enter your choice /n 1:deposite /n 2:withdarw /n 3:balance");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		sop("Enter the amount to deposite ");
		dep=sc.nextInt();
		dep+=dep+blac;
		sop("This is your total amount after deposite: "+dep);
		break;
		case 2:
		sop("Enter the amount to withdraw ");
		withdrw=sc.nextInt();
		withdrw-=blac-withdrw;
		sop("This is the amount after withdraw: "+withdrw);
		case 3:
		sop(blac);
		}
		try
		{
		if(blac<with)
		}
		catch(AgeException e)
		{
			//System.out.println(e);
		}
       
	}

}
