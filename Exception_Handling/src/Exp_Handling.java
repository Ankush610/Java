import javax.management.IntrospectionException;

public class Exp_Handling {
	public static void fn1() throws InterruptedException {
		fn2();
	}
	public static void fn2() throws InterruptedException {
		fn3();
	}
	public static void fn3() throws InterruptedException {
		throw new InterruptedException("Exception occured..");
	}

	public static void main(String[] args) {
		try{
			fn1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
