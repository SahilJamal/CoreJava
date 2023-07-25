package OOP.Keywords;

class Employee {
	
	int id;
	String name;
	
	Employee(Employee emp) {
		System.out.println(emp.id+" "+emp.name);
	}
	
	Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	void getEmployee(Employee emp) {
		System.out.println(emp.id+" "+emp.name);
	}
	
	void getEmployeeDetails(int id, String name) {
		this.id=id;
		this.name=name;
		this.getEmployee(this);
	}
}

public class ThisInArgument {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.getEmployeeDetails(1, "Divyesh");
		employee.getEmployee(employee);
		
	}

}
