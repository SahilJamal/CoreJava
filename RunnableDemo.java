package MultiThreading;

class MyThread3 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("My Thread " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {

		MyThread3 mt3 = new MyThread3();
		Thread thread1 = new Thread(mt3);
		thread1.setPriority(10);
		thread1.start();

//		MyThread3 mt4 = new MyThread3();
//		Thread thread2 = new Thread(mt4);
//		thread2.setPriority(1);
//		thread2.start();

	}

}
