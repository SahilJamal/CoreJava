package JavaCore;

class School {
	
	String name = "ITV";
	int batches = 20;
	String course = "Java";

	void getDetails() {
		System.out.println(name);
		System.out.println(batches);
		System.out.println(course);
	}
}

public class Student {
	public static void main(String[] args) {
		School sc = new School();
		sc.getDetails();
	}
	
}
