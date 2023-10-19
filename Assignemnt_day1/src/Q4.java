/*
HRA is 15% of BS
DA is 30% of BS
PF is 12.5% of GS
Gross Salary is BS + HRA + DA
Net Salary = Gross Salary – PF
*/

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
	System.out.println("Enter Basic Salary : ");
	Scanner sc = new Scanner(System.in);
	int BS = sc.nextInt();
	float per = BS/100;
	float G_sal = BS +(per*15)+(per*30);
	float net_sal = G_sal-(per*12.5f);
	
	System.out.println("Net Salary for "+BS+" is "+net_sal);
	

	}

}
