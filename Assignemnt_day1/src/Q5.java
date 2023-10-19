import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary : ");
		int BS = sc.nextInt();
		System.out.println("Enter Sales Amount : ");
		int SA = sc.nextInt();
		
		float per = SA/100;

		if(5000<=SA && SA<=7500)
			System.out.println("Net Salary at 3% comission : "+(per*3+BS));
		else if(7501<=SA && SA<=10500) 
			System.out.println("Net Salary at 8% comission : "+(per*8+BS));
		else if(10501<=SA && SA<=15000) 
			System.out.println("Net Salary at 11% comission : "+(per*11+BS));
		else if(15001<=SA) 
			System.out.println("Net Salary at 15% comission : "+(per*15+BS));
		else
			System.out.println("Sales Amount is too low!");
	}

}
