package Q3;

public class MarketExecutive extends Employee {
	private int km;
	private int tallow;
	private static int teleallow=2000;
	
	public MarketExecutive(int empid, String name, int salary, int km) {
		super(empid, name, salary);
		this.km = km;
		this.tallow = this.km*5;
	}
	
	public int Gross_salary(){
		int allow = km+tallow+teleallow;
		int gross = super.getSalary()+allow;
		return gross;
		
		
	}
	
	public double Net_Salary() {
		double PF = (super.getSalary()/100)*12.5;
		int gross = Gross_salary();
		double Net_Salary = gross+PF;
		return Net_Salary;
	}

	public String toString() {
		return super.toString() + "\nkm :" + km + "\ntallow=" + tallow ;
	}
	
	
	
	
}
