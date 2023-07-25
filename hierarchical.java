package OOP.Inheritance;

class Bank {
	int noOfEmployees;
	String branchName;
}

class SBI extends Bank {
	
	void getSBI() {
		noOfEmployees=20;
		branchName="Malad";
		System.out.println("Number of employees are: "+noOfEmployees);
		System.out.println("Branch name is: "+branchName);
	}
	
}

class BOB extends Bank {

	void getBOB() {
		noOfEmployees=22;
		branchName="Andheri";
		System.out.println("Number of employees are: "+noOfEmployees);
		System.out.println("Branch name is: "+branchName);
	}
}

class Axis extends Bank {
	void getAxis() {
		noOfEmployees=24;
		branchName="Goregaon";
		System.out.println("Number of employees are: "+noOfEmployees);
		System.out.println("Branch name is: "+branchName);
	}
}

public class hierarchical {
	public static void main(String[] args) {
		Axis axis= new Axis();
		axis.getAxis();
	}
}
