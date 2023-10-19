
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks For M1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter marks For M2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter marks For M3 : ");
		int m3 = sc.nextInt();
		System.out.println("Enter marks For M4 : ");
		int m4 = sc.nextInt();
		System.out.println("Enter marks For M5 : ");
		int m5 = sc.nextInt();
		
		float avg = (m1+m2+m3+m4+m5)/5.0f;
		System.out.println("Average is : "+avg);

	}

}
