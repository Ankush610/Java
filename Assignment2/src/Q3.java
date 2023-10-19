import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int [][] arr1 = new int[3][3];
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
		
		// to take the input 2
		System.out.println("Enetr elements in 3X3 array");
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
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				result[i][j] = 0;
				for(int k =0;k<3;k++)
				{
					result[i][j] = result[i][j]+arr1[i][k]*arr2[k][j];
					
				}
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}
		
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				result[i][j] = 0;
				for(int k =0;k<3;k++)
				{
					result[i][j] = result[i][j]+arr1[i][k]*arr2[k][j];
					
				}
				System.out.print(result[i][j]+" ");
				
			}
			
			
		}

	}


}
