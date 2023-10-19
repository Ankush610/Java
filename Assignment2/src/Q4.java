import java.util.Scanner;

public class Q4 {
	
	public static int add(int ...a)
	{
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
				

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The count of values ");
		int size = sc.nextInt();
		System.out.println(" Enetr the values for addition");
		int []a  =  new int [size];
		for(int i=0; i<a.length;i++)
			a[i] = sc.nextInt();
		System.out.println(add(a));
	}

}
