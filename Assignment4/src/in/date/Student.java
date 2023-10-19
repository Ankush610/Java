package in.date;

public class Student {
	private int roll;
	private String name;
	private Date dob;
	
	public Student(int roll, String name,int d,int m,int y) {
		this.roll = roll;
		this.name = name;
		this.dob = new Date(d,m,y);
	}
	
	public Student() {
		roll = 0;
		name = "None";
		dob = new Date();
	}

	public String toString() {
		return "roll=" + roll + ", name=" + name + ", dob=" + dob.display() ;
	}
		
}
