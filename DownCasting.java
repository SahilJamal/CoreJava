package OOP.Polymorphism;

class Parent {
	
	void getDetails() {
		System.out.println("Parent details");
	}
	
}

class Child extends Parent {
	void getDetails() {
		System.out.println("Child details");
	}
}

public class DownCasting {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		Child c = (Child)p;
		c.getDetails();
		
	}
	
}
