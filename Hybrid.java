package OOP.Inheritance;

class A1 {
	void printA() {
		System.out.println("A");
	}
}

class B1 extends A1 {
	void printB() {
		System.out.println("B");
	}
}

class C1 extends B1 {
	void printC() {
		System.out.println("C");
	}
}

class D1 extends A1 {
	void printD() {
		System.out.println("D");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		D1 d = new D1();
		d.printD();
		
		C1 c = new C1();
		c.printA();
	}
	
}
