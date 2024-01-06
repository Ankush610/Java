package in.Assign8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class utility_List {
	private List<Student> list;

	public utility_List(List<Student> list) {
		this.list = list;
	}

	public void Display() {
		System.out.println(this.list);
	}

	public void create_list() {
//		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Students : ");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Enter No of hobbies You Have :");
			int y = sc.nextInt();
			System.out.println("Enter your hobbies");
			Set<String> s1 = new HashSet<>();
			for (int j = 0; j < y; j++)
			{
				s1.add(sc.next());
			}
			System.out.println("Enter Student Details : ID , Name , Percentage ");
			Student s2 = new Student(sc.nextInt(), sc.next(), sc.nextDouble(), s1);
			this.list.add(s2);

		}
	}
}

class SortCompa implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getPercentage() > o2.getPercentage())
			return -1;
		else if (o1.getPercentage() < o2.getPercentage())
			return 1;
		else
			return 0;
	}

}