
/*
Write a program to generate all possible combinations of 1, 2, 3 using for loop.
*/

public class Q10 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j!=i) 
				{
				for(int k=1;k<=3;k++) 
					{
					if(k!=j && k!=i)
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
			
		

}	
}