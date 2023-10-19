/*
Write a program for matchstick game between the computer and the user.  
Your program should ensure that the computer always wins. Rules for the game are as follows:				
a. There are 21 matchsticks									
b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.					
C. Player is given the chance to pick the sticks first then the computer picks the sticks.		
d. Whoever is forced to pick up the last matchstick loses the game.
*/

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		int MS = 26;
		int UI = 0;
		int CC = 0;
		Scanner sc = new Scanner(System.in);
		while (MS!=1)
		{
			System.out.println("Choose Match Stick out of "+MS);
			UI = sc.nextInt();
			if(UI<=4 && UI>=1)
			{
				MS = MS-UI;
				CC = ((MS-1)%5);
				System.out.println("Computer Choose ="+CC);
				MS = MS-CC;
				if(MS==1)
					System.out.println("1 Match Stick Remaining\nYou've Lost");
				else
					System.out.println(MS+" Match Sticks Remaining");
			}
			else
				System.out.println("Choose only between 1-4");
			
		}

	}

}
