import java.util.*;    //mohd sahil
class Even
{
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		String[] trick = { "even", "odd" };
		System.out.println(number + " is " + trick[number & 1]);
	}
}