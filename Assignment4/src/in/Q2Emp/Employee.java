package in.Q2Emp;
import in.date.Date;

public class Employee {
	private int empid;
	private String name;
	private Date dob;
	
	public Employee(int empid, String name,int d,int m,int y) {
		this.empid = empid;
		this.name = name;
		this.dob = new Date(d,m,y);
	}
	
	public Employee() {
		empid = 0;
		name = "none";
		dob = new Date();
	}
	
	public String show() {
		return "empid : " + empid + "\nname : " + name + "\ndob : " + dob.display();
	}
	
}




