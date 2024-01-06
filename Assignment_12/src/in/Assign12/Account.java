package in.Assign12;
import java.io.Serializable;
import java.util.ArrayList;

import in.Assign12.Read_Write_DAT.*;

public class Account implements Serializable{
	private int id;
	private String name; 
	int balance;
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int id, String name2, int balance) {
		this.id = id;
		this.name = name2;
		this.balance = balance;
	}

	public void withdraw(int val){
		this.balance = this.balance-val;
			
	}
	
	public void deposite(int val) {
		this.balance = this.balance+val;
		
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
