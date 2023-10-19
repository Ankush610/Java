import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a : ");
		int a = sc.nextInt();
		System.out.println("Enter Number b : ");
		int b = sc.nextInt();
		
		System.out.println("Value of a : "+a+" Value of b : "+b);
		
		int c;
		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a : "+a+" Value of b : "+b);
		
		a = a - b;
		b = b + a;
		a = b - a;
		
		System.out.println("Value of a : "+a+" Value of b : "+b);

	}

}
