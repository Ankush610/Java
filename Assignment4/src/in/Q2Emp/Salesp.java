package in.Q2Emp;

public class Salesp extends WageEmp {
	private int itemsold;
	private int commission;
	
	public Salesp(int empid, String name, int d, int m, int y, int hour, int rate, int itemsold, int commission) {
		super(empid, name, d, m, y, hour, rate);
		this.itemsold = itemsold;
		this.commission = commission;
	}
	
	public Salesp() {
		super();
		itemsold = 0;
		commission = 0;
	}
	
	public int Salary() {
		int Salary = super.Salary() + itemsold*commission;
		return Salary;
	}

	public String show() {
		return super.show()+ "\nItemsold : " + itemsold + "\nCommission : " + commission ;
	}
	
	
	
}
