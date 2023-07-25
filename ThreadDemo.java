package MultiThreading;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread");
		}
	}

}

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread 2");
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		mt1.start();

		MyThread2 mt2 = new MyThread2();
		mt2.start();

	}

}
