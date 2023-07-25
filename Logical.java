package JavaCore;

public class Logical {

	public static void main(String args[]) {

		boolean a = true;
		boolean b = !a;

		System.out.println(b);
		
		int n1 =10;
		int n2 =20;
		int n3 =30;
		int n4 =40;
		
		/* 
		This is 
		Logical operators
		 */
		boolean and = n1<n2 && n2<n3 && n3<n4;
		System.out.println(and);
		
		boolean or = n1>n2 || n2>n3 || n4>n3;
		System.out.println(or);
		
		boolean abc = n2>n1 || (n3>n2 && n4==n3);
		System.out.println(abc);
		
		int num1 = 5;
		int num2 = 2;
		
		// Bitwise operators
		int num3 = num1 & num2;
		int num4 = num1 | num2;
		int num5 = num1 ^ num2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

	}

}
