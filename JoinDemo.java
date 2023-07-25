package MultiThreading;

class Demo4 extends Thread {

	Demo5 d5 = new Demo5();

	public void run() {
		try {
			d5.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Demo4: " + i);
		}
	}

}

class Demo5 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Demo5: " + i);
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Demo4 d4 = new Demo4();
		d4.start();

		Demo5 d5 = new Demo5();
		d5.start();
	}

}
