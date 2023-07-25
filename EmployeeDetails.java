package OOP;

class Employee {

	int id;
	String name;
	String surname;
	
	// Constructor
	public Employee(int eid, String ename, String esurname) {
		id=eid;
		name=ename;
		surname=esurname;
		System.out.println(id+ " "+name+" "+surname);
	}

}

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Divyesh","Pithadiya");
		Employee e2 = new Employee(2,"Hardik","Patel");
		

	}

}
