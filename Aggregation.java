package OOP.Inheritance;

class Address {
	int flatNo;
	String apartmentName;
	String street;

	public String getAddress() {
		return flatNo + "," + apartmentName + "," + street;
	}
}

class Student {

	int roll;
	String name;

	// referance
	Address address;
	
	Student() {
		address= new Address();
	}

	void getStudent(int sRoll, String sName, int flatNo, String aName, String street) {
		roll = sRoll;
		name = sName;
		address.flatNo = flatNo;
		address.apartmentName = aName;
		address.street = street;
		System.out.println(roll + " " + name + " "+address.getAddress());
	}

}

public class Aggregation {

	public static void main(String[] args) {
		Student student = new Student();
		student.getStudent(1, "Divyesh", 40, "Shiv sagar", "Tanaji");
	}

}
