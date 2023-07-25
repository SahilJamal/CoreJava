package GarbageCollections;

public class Garbagedemo {

	public void finalize() {
		System.out.println("Finalize method called");
	}
	
	
	public static void main(String[] args) {

		Garbagedemo g1 = new Garbagedemo();
		Garbagedemo g2 = new Garbagedemo();
		g1=null;
		g2=null;
		
		System.gc();

	}

}
