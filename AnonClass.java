package InnerClassDemo;

abstract class Demo {
	abstract void getDetails();
}

interface Demo2 {
	void getDetails();
}

public class AnonClass {

	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			void getDetails() {
				System.out.println("This is anom class");
			}
		};

		d.getDetails();

		Demo2 d2 = new Demo2() {
			
			class Demo {
				void getdata() {
					System.out.println("This is data");
				}
			}
			
			Demo d = new Demo();
			@Override
			public void getDetails() {
				System.out.println("This is interface anom demo");
				d.getdata();
			}
		};

		d2.getDetails();
	}
}
