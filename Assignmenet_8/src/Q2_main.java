import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import in.Assign8.Vehicle;


public class Q2_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Vehicle> s1 = new HashSet<>();
		
		
		while(true) {
			System.out.println("1.Add vehicle Record"
					+ "\n2.Display all vehilce"
					+ "\n3.Display min and max Vehicle cost"
					+ "\n4.Exit");
			
			int x = sc.nextInt();
			if(x>3) {
				System.out.println("Thank You For Visiting...");
				break;
			}
				
			switch(x) {
			case 1:
				System.out.println("Enter Vehcile Number , Vehicle name , Vehicle Cost");
				s1.add(new Vehicle(sc.nextInt(),sc.next(),sc.nextDouble()));
				break;
			case 2:
				for(Vehicle v:s1) {
					System.out.println(v);
				}
				break;
			case 3:
				//System.out.println(s1);
				TreeSet<Vehicle> t1 = new TreeSet<>(s1);
				System.out.println("Veichile with Minimum cost "+t1.first());
				System.out.println("Veichile with Maximum cost "+t1.last());
				}
				break;
				
			}
		}
		
		
		
		
		
		
	}

