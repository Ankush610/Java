import java.util.Scanner;

public class Q1A {

		public static int max_min(int ...a){
			int max = a[0];
			int min = a[0];
	        
			for(int i=1;i<a.length;i++){
				if(a[i]>max) {
					max = a[i];
				}
				else if(a[i]<min) {
					min = a[i];
				}
		}
			System.out.println("Max Val is : "+max);
			System.out.println("Min Val is : "+min);
			return 1 ;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Array Size : ");
			int size = sc.nextInt();
			
			int [] arr = new int[size];

			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			
			max_min(arr);
			
		}

	}

