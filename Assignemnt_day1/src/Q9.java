
/*
 * Write a program to display whether a user entered number is prime or not
 */

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		int i = 2;
		while(i != (a/2)+1)
		{
			if(a%i==0) 
			{
				System.out.println("Given Number is Not Prime");
				break;
			}
			i++;
			
		}
		
	if(i==a-1)
	{
		System.out.println("Given Number is Prime");
	}
		
	}

}
