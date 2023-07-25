package OOP.Polymorphism;

class Bank {
	void getBank() {
		System.out.println("These are bank details");
	}
}

class SBI extends Bank {
	void getBank() {
		System.out.println("These are bank details for SBI");
	}
}

class AXIS extends Bank {
	void getBank() {
		System.out.println("These are bank details for AXIS");
	}
}

public class Overriding {
	public static void main(String[] args) {
		AXIS axis = new AXIS();
		axis.getBank();
	}
}
