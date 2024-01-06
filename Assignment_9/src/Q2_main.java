import java.util.Scanner;

class FirstThread extends Thread {
	int ite;

	public FirstThread(int it) {
		this.ite = it;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("First Thread..." + (this.ite + i));
		}
	}
}

class SecondThread extends Thread {
	int ite;

	public SecondThread(int it) {
		this.ite = it;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Second Thread..." + ite + " * " + i + " = " + (ite * i));
		}
	}
}

class MyThread implements Runnable {

	Thread t1, t2;
	int it;

	public MyThread() {
		this.it = 10;
		t1 = new Thread(this, "t1");
		t2 = new Thread(this, "t2");
		t1.start();
		t2.start();
	}

	public MyThread(int it) throws InterruptedException {
		this.it = it;
		t1 = new Thread(this, "t1");
		t2 = new Thread(this, "t2");
		t1.start();
		t2.sleep(300);
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (Thread.currentThread() == t1) {

				System.out.println("Thread 1\n" + (it + i));
			} else if (Thread.currentThread() == t2)

				System.out.println("Thread 2\n" + it + " * " + i + " = " + (it * i));

		}
	}

}

public class Q2_main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enetr a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new MyThread(x);

		FirstThread f1 = new FirstThread(x);
		SecondThread s1 = new SecondThread(x);
		f1.start();

		f1.sleep(300);
		s1.start();

	}
}
