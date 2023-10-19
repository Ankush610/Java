import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("A is "+a+"\nB is "+b+"\nC is "+c);
		if(a>b && a>c)
			System.out.println("A is Greater");
		else if(b>a && b>c)
			System.out.println("B is Greater");
		else if(c>a && c>b)
			System.out.println("C is Greater");

	}

}
