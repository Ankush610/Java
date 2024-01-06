package in.assign9;
import in.assign9.Myexp.*;

public class Account {
	double balance;

	public Account(double balance) {
		
		this.balance = balance;
	}
	
	public void withdraw(double val) throws Myexp {
		if (this.balance >= val) {
			this.balance = this.balance-val;
			System.out.println("Balance remaining"+(this.balance));
		}
		else if(val > 15000)
			throw new Myexp("OverLimit");
		else
			throw new Myexp("InsufficientBalance");
			
	}
	
	public void deposite(double val) {
		this.balance = this.balance+val;
		System.out.println("Update Balance is "+(this.balance));
	}

}
