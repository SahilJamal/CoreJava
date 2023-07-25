package OOP;

class Demo1 {

//	String name = "Divyesh";
//	String surname = "Pithadiya";

	String getDetails(String name, String surname) {
		String details = name + " " + surname;
		return details;
	}
}

public class Methods {

	public static void main(String args[]) {

		Demo1 d = new Demo1();
		System.out.println(d.getDetails("Divyesh", "Pithadiya"));
		System.out.println(d.getDetails("Hardik", "Pandya"));

	}

}
