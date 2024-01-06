import in.Assign8.Student;
import in.Assign8.utility_List;
import in.Assign8.utility_Report;

import java.util.*;

public class Q1_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> l1 = new ArrayList<>();
		utility_List s1 = new utility_List(l1);
		Map<String, Double> m = new HashMap<>();
		utility_Report ur = new utility_Report(m);

		while (true) {
			System.out.println("1.Insert Student Data" + "\n2.Display all Student Data" + "\n3.Display Student Report"
					+ "\n4.Exit");

			int x = sc.nextInt();
			if (x > 3) {
				System.out.println("Thank You For Visiting...");
				break;
			}
			switch (x) {
			case 1:
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				s1.create_list();
				break;

			case 2:
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				s1.Display();
				break;

			case 3:
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				ur.show_report(l1);
				break;

			}
		}
	}
}
