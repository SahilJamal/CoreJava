import java.util.*;
class vovel
{
	public static void main(String args[])
	{
	char vovel;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your charecter");
	vovel=sc.next().charAt(0);
	if(vovel=='a'||vovel=='e'||vovel=='u'||vovel=='i'||vovel=='o'||vovel=='A'||vovel=='E'||vovel=='U'||vovel=='I'||vovel=='O')
	{
	System.out.println("The charecter is vovel");
	}
	else 
	{
	System.out.println("The charecter is not vovel");
	}
	}
}
