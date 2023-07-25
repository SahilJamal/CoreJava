package NewFeatures;

interface InterfaceJava8 {
	
	static void getStaticDetails() {
		System.out.println("this is static data");
	}
	
	private void getdata() {
		System.out.println("This is private method");
	}
	
	default void callGetData() {
		getdata();
	};
}

class interfaceDemo implements InterfaceJava8 {
	
}

class Demo {
	public static void main(String[] args) {
		InterfaceJava8.getStaticDetails();
		
		InterfaceJava8  i = new interfaceDemo();
		i.callGetData();
	}
}
