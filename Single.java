package OOP.Inheritance;

class Parent {
	void getParentDetails() {
		System.out.println("This is parent");
	}
}

class Child extends Parent {
	void getChildDetails() {
		System.out.println("This is child");
	}
}

public class Single {
	public static void main(String[] args) {
		Child child = new Child();
		child.getParentDetails();
		child.getChildDetails();

		Parent p = new Parent();
	}
}
