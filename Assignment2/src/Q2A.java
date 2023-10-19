import java.util.Scanner;

public class Q2A {

	public static void main(String[] args) {
		
		int [][] arr1 = new int[3][3];
		int [][] tra = new int[3][3];
		int [][] arr2 = new int[3][3];
		int [][] result = new int[3][3];
		Scanner sc = new Scanner(System.in);
		// to take the input 1
		System.out.println("Enetr elements in 3X3 array");
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr1[i].length;j++) {
				arr1[i][j]= sc.nextInt();
			}
		}
		
		
		
		
		// to display the array1
		System.out.println("array entered");
		for(int []temp:arr1)
		{
			for(int val:temp) {
				System.out.print(val);
			}
			System.out.println();
		}
		
		
		
		// to transpose the array
		System.out.println("Transposed");
		for(int i = 0;i<arr1.length;i++)
		{
			for(int j = 0;j<arr1[i].length;j++) {
				tra[i][j] = arr1[j][i];
				System.out.print(tra[i][j]);
			}
			System.out.println();
		}
		
		// to take the input array 2
		System.out.println("Enter elements in another 3X3 array for Addition");
		for(int i = 0;i<arr2.length;i++)
		{
			for(int j = 0;j<arr2[i].length;j++) {
				arr2[i][j]= sc.nextInt();
						
			}
		}
		
		
		
		// to display the array2
		System.out.println("array entered");
		for(int []temp:arr2)
		{
			for(int val:temp) {
				System.out.print(val);
			}
			System.out.println();
		}
		
		
		
		// to Add
		System.out.println("Result");
		for(int i = 0;i<result.length;i++)
		{
			for(int j = 0;j<result[i].length;j++) {
				result[i][j]= arr1[i][j] + arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
