package OOP.Keywords;

class Student extends Object {

	int roll;
	String name;
	String surname;

	public Student() {
		System.out.println("Student details");
		
	}
	
	public Student(int roll, String name, String surname) {
		this();
		this.roll = roll;
		this.name = name;
		this.surname = surname;
	}

	void getStudent() {
		System.out.println(this.roll + " " + this.name + " " + this.surname);
	}
	
	void getStudentDetails() {
		this.getStudent();
	}

}

public class ThisKeyword {
	public static void main(String[] args) {
		Student student = new Student(1, "Divyesh", "Pithadiya");
		student.getStudentDetails();
	}
}
