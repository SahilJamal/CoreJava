package MultiThreading;

class Demo {
	 void getCount() {
		 
		 synchronized(this) {
			 for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
		 }
		 
		
	}
}

class SyncDemo1 extends Thread {
	Demo d;

	public SyncDemo1(Demo d) {
		this.d = d;
	}

	public void run() {
		d.getCount();
	}
}

public class Synchronization {

	public static void main(String[] args) {

		Demo d = new Demo();

		SyncDemo1 s1 = new SyncDemo1(d);
		s1.start();

		SyncDemo1 s2 = new SyncDemo1(d);
		s2.start();
	}

}
