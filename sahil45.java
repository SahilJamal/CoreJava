import java.util.*;
class sahil45
{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name");
		String s="";
         s=sc.next();		// here is what we difine in string 
		String d="";        // here a empty string for storing the values
		for(int i=s.length()-1;i>=0;i--){    //here the loop is going backwords
		d = d + s.charAt(i);      //d is storing value first and second and so,where s.charAt(i) is what reading word from string 
		}
	    if(s.equalsIgnoreCase(d)) // this is mendetary for the condition to check
		{
		System.out.println("The name is palindrome "+d); //is printing string
		}
		else
		{
			System.out.println("The name is not palindrome "+d);
		}

	 }
}