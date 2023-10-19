package Q3;

public class Manager extends Employee {
	
	private int Petrol; 
	private int Food; 
	private int Other;

	public Manager() {
		super();
		Petrol =0;
		Food = 0;
		Other =0;
	}

	public Manager(int empid, String name, int salary) {
		super(empid, name, salary);
		int per = (super.getSalary()/100);
		Petrol = per*8;
		Food = per*12;
		Other = per*4;
	}
	
	
	public int Gross_salary(){
		int allow = Petrol+Food+Other;
		int gross = super.getSalary()+allow;
		return gross;
		
	}
	
	public double Net_Salary() {
		double PF = (super.getSalary()/100)*12.5;
		int gross = Gross_salary();
		double Net_Salary = gross+PF;
		return Net_Salary;
	}

	@Override
	public String toString() {
		return super.toString()+"\nPetrol : " + Petrol + "\nFood : " + Food + "\nOther : " + Other;
	}
	
	
	
	

}
