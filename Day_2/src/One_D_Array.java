import java.util.Scanner;

public class One_D_Array {

	public static void main(String[] args) {
		int [] a = {10,20,13,15,48};
		int [] b = new int [] {10,52,15,65,45};
		int [] c = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr Array Elements");
		
		for(int i =0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		System.out.println("Array-");
		for(int i =0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
		System.out.println();
		
		for(int val:c) {
			System.out.print(val+" ");
		}

	}

}
