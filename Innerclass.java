package InnerClassDemo;
class Outer {
	int a=10;
	int b=20;
	class Inner {
		int c = 20;
		int d = 30;
		
		void getSum() {
			System.out.println("Sum is: "+(c+d));
		}
	}
}
public class Innerclass {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.getSum();
		
		
	}
	
}
