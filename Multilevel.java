package OOP.Inheritance;

class A {

	void printA() {
		System.out.println("This is A");
	}

}

class B extends A {
	
	void printB() {
		System.out.println("This is B");
	}
}

class C extends B {
	void printC() {
		System.out.println("This is C");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		C c = new C();
		c.printC();
		c.printB();
		c.printA();

		B b = new B();
		b.printB();
		b.printA();

		A a = new A();
		a.printA();
	}
}
