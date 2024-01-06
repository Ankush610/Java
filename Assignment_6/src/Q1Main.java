import java.util.Scanner;
import java.util.Vector;
import in.emp.*;

public class Q1Main {

	public static void main(String[] args) {
		Vector<Employee> arr = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Enter New Entry:\n"
					+ "2. Show Employee Details\n"
					+ "3. Update Employee Salary\n"
					+ "4. Diplay all Entries\n"
					+ "5. Exit");
			int ch = sc.nextInt();
			if(ch==5)
				break;
			switch(ch) {
			
			case 1:
				System.out.println("Enter Employee ID");
				int eid = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.next();
				System.out.println("Enter Employee Salary");
				int sal = sc.nextInt();
				Employee e = new Employee(eid,name,sal);
				arr.add(e);
				break;
			case 2:
				System.out.println("Enter Employee ID");

				int e_id = sc.nextInt();
				for(Employee val: arr) {
					if(val.Display(e_id)!=null)
					{
						System.out.println(val);
						break;
				}}
				break;
				
			
			case 3:
				System.out.println("Enter Employee id to update");
				eid = sc.nextInt();
				System.out.println("Enter new Salary");
				sal = sc.nextInt();
				for(Employee val1: arr) {
					if(val1.update(eid,sal)==1) {
						System.out.println(val1);
						break;
				}}
				break;
			case 4:
				for(Employee v:arr) {
					System.out.println(v);
				}
				break;
					
			}

		}
	}
}
			
			
			
			
			
			

			
		
				

