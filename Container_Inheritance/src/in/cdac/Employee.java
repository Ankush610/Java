package in.cdac;

public class Employee {
	private int empid;
	private String name;
	private Date dob;// this is the concept of containment "has a" kind relationship between date class and Employee class
	
	public Employee() {
		empid = 101;
		name = "abc";
		dob = new Date();
	}

	public Employee(int id, String nm,int d,int m,int y) {
		empid = id;
		name = nm;
		dob = new Date(d,m,y);
	}
	
	public void show() {
		System.out.println(empid);
		System.out.println(name);
		dob.show();
	}
	

}
