package OOP.Keywords;

class Bank {
	int employees = 20;
	
	Bank() {
		System.out.println("Bank Constructor");
	}
	
	Bank(int acc, int bal) {
		System.out.println("Account is: "+acc);
		System.out.println("Balance is: "+bal);
	}
	
	void getBank(){
		System.out.println("This is Bank");
	}
}

class Axis extends Bank{
	int employees = 30;

	Axis(int acc, int bal) {
		super(acc, bal);
	}
	
	Axis() {
		super();
		System.out.println("Axis Constructor");
	}
	
	void getBank() {
//		Bank bank = new Bank();
//		bank.getBank();
		super.getBank();
		System.out.println("No of employees in bank: "+super.employees);
		System.out.println("This is Axis Bank");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Bank bank = new Axis();
		bank.getBank();
		
		Bank axis = new Axis(1010, 40000);
		
//		Bank bank1 = new Bank();
//		bank1.getBank();
	}
}
