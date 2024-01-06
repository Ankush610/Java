package in.emp;

public class Employee {
	private int empid;
	private String name;
	private int salary;
	public Employee(int id, String nm, int sal) {
		empid = id;
		name = nm;
		salary = sal;
	}
	
	public Employee() {
		empid = 0;
		name = "None";
		salary = 0;
	}

	public String toString() {
		return "empid : " + empid + "\nname : " + name + "\nsalary : " + salary;
	}
	
	public String Display(int eid) {
		if (eid == empid)
			return "empid : " + empid + "\nname : " + name + "\nsalary : " + salary;
		
		else
			return null;
	}
	
	public int update(int id, int sal) {
		if (id == empid) {
			this.salary = sal;
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
