import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("Enetr two numbers");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1. addition\n"
				+ "2. substraction\n"
				+ "3. multiplication\n"
				+ "4. division\n");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("ans = "+(a+b));
			break;
		case 2:
			System.out.println("ans = "+(a-b));
			break;
		case 3:
			System.out.println("ans = "+(a*b));
			break;
		case 4:
			System.out.println("ans = "+(a/b));
			break;
		}
			
	}

}
