import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Student implements Comparable<Student>
{
	private int roll;
	private String name;
	private double percentage;
	private Set<String> skill;
	

	public Student(int roll, String name, double percentage, Set<String> skill) {
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
		this.skill = skill;
	}

	
	public double getPercentage() {
		return percentage;
	}

	
	public String toString() {
		return "roll : " + roll + " name : " + name + " percentage : " + percentage + " skillset : " + skill;
	}


	public int compareTo(Student o) {
		if(this.percentage> o.percentage)
			return -1;
		else if (this.percentage< o.percentage)
			return 1;
		else
			return 0;
	}
	
}

class UtilityList
{
	private List<Student> list;
	
	public UtilityList(List<Student> list) {
		this.list = list;
	}
	
	public void Display() {
		System.out.println(this.list);
	}
}

class SortCompa implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPercentage()> o2.getPercentage())
			return -1;
		else if (o1.getPercentage()< o2.getPercentage())
			return 1;
		else
			return 0;
	}
	
}

public class Q1Main {
	
	public static void main(String [] args)
	{
		//Set<String> s1 = new HashSet<>();
		
		List<Student> l1 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int x = sc.nextInt();
		
		
		for(int i=0;i<x;i++) {
			System.out.println("Enter your hobbies");
			Set<String> s1 = new HashSet<>();
			s1.add(sc.next());
			s1.add(sc.next());
			s1.add(sc.next());
			System.out.println("Enter Student Details : ID , Name , Percentage ");
			Student s2 = new Student(sc.nextInt(),sc.next(),sc.nextDouble(),s1);
			l1.add(s2);
			
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		UtilityList u1 = new UtilityList(l1);
		u1.Display();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Collections.sort(l1);
		System.out.println(l1);
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Collections.sort(l1, new SortCompa());
		System.out.println(l1);
		
		
	}
		

}
