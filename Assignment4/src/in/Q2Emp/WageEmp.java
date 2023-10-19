package in.Q2Emp;

public class WageEmp extends Employee {
	private int hour;
	private int rate;
	
	public WageEmp(int empid, String name, int d, int m, int y, int hour, int rate) {
		super(empid, name, d, m, y);
		this.hour = hour;
		this.rate = rate;
	}
	
	public WageEmp() {
		super();
		this.hour = 0;
		this.rate = 0;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int Salary() {
		int Salary = hour * rate;
		return Salary;
	}
	
	public String show() {
		String x = super.show();
		return x+ "\nHours : "+hour+"\nRate : "+rate;
	}

	
	
	
	
	
	
}
