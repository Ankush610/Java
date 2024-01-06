package in.Assign8;

import java.util.Objects;
import java.util.Set;

public class Student {
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

	
	public String getName() {
		return name;
	}


	public String toString() {
		return " roll : " + roll + "\n name : " + name + "\n percentage : " + percentage + "\n skillset : " + skill;
	}

	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, percentage, roll, skill);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& roll == other.roll && Objects.equals(skill, other.skill);
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
