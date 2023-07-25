package JavaCore;

class StudentDetails {
	
	// instance variables
	int roll;
	String fname;
	String lname;
	
	// static variable
	static String collegeName = "ITV";
	
	void getCollege() {
		// local variable
		String course="Java";
		System.out.println(roll+" "+fname+" "+lname+" "+course);
	}

}

public class Variables {

	public static void main(String[] args) {
		StudentDetails sd1 = new StudentDetails();
		sd1.roll=1;
		sd1.fname="Divyesh";
		sd1.lname="Pithadiya";
		
		sd1.getCollege();
		System.out.println(StudentDetails.collegeName);
		
		StudentDetails sd2 = new StudentDetails();
		StudentDetails.collegeName = "NL";
	
		System.out.println(sd1.collegeName);
		
		sd2.getCollege();
	}

}
