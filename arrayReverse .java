import java.util.*;
public class arrayReverse {
    public static void main(String[] args)
    {
	Scanner sc=new Sacnner (System.in);
	    int i, k, t,n;
		System.out.println("Enter the length of name: ");
		n=sc.nextInt();
        char a[]=new char[n]
        reverse(arr, arr.length);
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }
  
    }
}