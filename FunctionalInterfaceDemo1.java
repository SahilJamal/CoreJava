package NewFeatures;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		Student student2 = (String name) ->{
			System.out.println("Name: "+name);
		};
		
		student2.getDetails("Divyesh");
	}
	
}
