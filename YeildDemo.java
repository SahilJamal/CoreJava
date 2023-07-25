package MultiThreading;

class Demo1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Demo1: " + i);
			Thread.yield();
		}
	}
}

class Demo2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Demo2: " + i);
		}
	}
}

class Demo3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Demo3: " + i);
		}
	}
}

public class YeildDemo {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.start();

		Demo2 d2 = new Demo2();
		d2.start();
		
		Demo3 d3 = new Demo3();
		d3.start();
	}
}
