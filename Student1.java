package OOP.Polymorphism;

public class Student {

	int id;
	String fname;
	String lname;

	String getStudent(int roll, String fn, String ln) {
		id = roll;
		fname = fn;
		lname = ln;
		return id + " " + fname + " " + lname;
	}
	
	String getStudent() {
		id=1;
		fname="Divyesh";
		lname="Pithadiya";
		return id + " " + fname + " " + lname;
	}
	
	void getstudent() {
		System.out.println("This is default student method");
	}

}
