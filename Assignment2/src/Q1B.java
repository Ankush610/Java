import java.util.Scanner;

public class Q1B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter size of Array");
		int x = sc.nextInt();
		
		int [] arr2 = new int [x];
		int [] arr = new int [x];
		System.out.println("Enetr array elements");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++)
		{
			arr2[i] = arr[i]*5;
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		

	}

}
