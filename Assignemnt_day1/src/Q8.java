
/*
 Write a program to print whether user entered number is an Armstrong number.
 Armstrong number is one for which the sum of the cube of all its digits is same as the number.  
 For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)
*/

import java.util.Scanner;

public class Q8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Number : ");
		int a = sc.nextInt();
		int c = a;
		double sum = 0;
		double b;
		while(a>0) {
			b = a%10;
			b = b*b*b;
			sum = sum + b;
			a = a/10;
		}
		
		if(c==sum) {
			System.out.println("the number is armstrong since a = "+c+" Sum = "+sum);
		}
		else
			System.out.println("the number is not armstrong since a = "+c+" Sum = "+sum);
		
	}
}
