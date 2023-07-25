package OOP.Keywords;

class Stud {
	int roll;
	String name;
}

class Teacher {
	
	int id;
	String name;
	
	void getStudent(Stud student) {
		System.out.println(student.name+" "+student.roll);
	}
}

public class ObjectAsParameter {
	public static void main(String[] args) {
		Stud student = new Stud();
		student.roll=1;
		student.name="Divyesh";
		
		Teacher teacher = new Teacher();
		teacher.getStudent(student);
		
	}
}
