import java.io.FileInputStream;

interface c1{
	public int show();
};


class FirstThread extends Thread{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println("First Thread...");
		}
	}
}
class SecondThread extends Thread{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println("Second Thread...");
		}
	}
}
public class Using_extend_thread_class {

	public static void main(String[] args) {
		
		c1 c = ()-> {return 2+3;};
		System.out.println(c.show());
		
		
//		FirstThread f1 = new FirstThread();
//		SecondThread s1 = new SecondThread();
//		f1.start();
//		s1.start();
		
		
	}
}
