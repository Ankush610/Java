import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int temp = 0;
		int [] a = new int[sc.nextInt()];
		
		
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Normal Array : ");
		for(int val:a)
			System.out.print(val+" ");
		System.out.println();
		
		for(int i=0;i<a.length/2;i++) {
			temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
			
		}
		System.out.println("Reversed Array : ");
		for(int val:a)
			System.out.print(val+" ");

	}

}
