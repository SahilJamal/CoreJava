import java.util.*;
public class arrayReverse {
    public static void main(String[] args)
    {
	Scanner sc=new Scanner (System.in);
	    int i, k,n,j; char t;
		System.out.println("Enter the length of name: ");
		n=sc.nextInt();
        char a[]=new char[n];
		System.out.println("Enter the charecter of name: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next().charAt(0);
		}
       for(i=0;i<a.length;i++)
	   {
		   for(j=a.length;j<=n;j--)
		   {
			   System.out.print(j);		   
		   }
		   
	   }
  
    }
}