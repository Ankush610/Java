/*
 Write a program to check if user entered number is perfect number.
 (A perfect number is a number for which sum of its factors equals that number e.g. 6=1+2+3,  28=1+2+4+7+14)

 */

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i< a)
		{
			if(a%i==0) 
			{
				sum = sum +i;
			}
			i++;
			
		}
	if(sum == a)
	{
		System.out.println("Given number is Perfect Number");
	}
		
	}
		
	}


