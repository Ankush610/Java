
class Account
{
	private int balance;
	
	public Account() {
		balance = 10000;
	}
	
	//----------------------- executes serially  ------------------------------------------- 
	
	
//	public void deposit(int amount) 
//	{
//		System.out.println("Before Deposit : "+balance);
//		balance = balance + amount;
//		System.out.println("After Deposit : "+balance);
//	}
//	
//	public void withdraw(int amount)
//	{
//		System.out.println("Before Withdraw : "+balance);
//		balance = balance - amount;
//		System.out.println("After Withdraw : "+balance);
//	}
	
	
	
	//----------------------- executes with serial synchronization ------------------------------------------- 
	
	
	public synchronized void deposit(int amount) 
	{
		System.out.println("Before Deposit : "+balance);
		balance = balance + amount;
		System.out.println("After Deposit : "+balance);
	}
	
	public synchronized void withdraw(int amount)
	{
		System.out.println("Before Withdraw : "+balance);
		balance = balance - amount;
		System.out.println("After Withdraw : "+balance);
	}

	
	//----------------------- executes with parallel synchronization ------------------------------------------
	
	
//	public void deposit(int amount) 
//	{
//		synchronized(this)
//		{
//			System.out.println("Before Deposit : "+balance);
//			balance = balance + amount;
//			System.out.println("After Deposit : "+balance);
//		}
//	}
//	
//	public void withdraw(int amount)
//	{
//		synchronized(this)
//		{
//		System.out.println("Before Withdraw : "+balance);
//		balance = balance - amount;
//		System.out.println("After Withdraw : "+balance);
//		}
//	}

}

class AccountUser extends Thread
{
	private String name,tot; // tot --> time of transaction
	private Account account;
	private int amount;
	
	public AccountUser(String n,Account acc,String tran,int amt)
	{
		name = n;
		account = acc;
		tot = tran;
		amount = amt;
	}
	
	public void run()
	{
		if(tot.equals("deposit"))
			account.deposit(amount);
		else if(tot.equals("withdraw"))
			account.withdraw(amount);
	}
}

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		AccountUser user1 = new AccountUser("abc",account,"deposit",100);
		AccountUser user2 = new AccountUser("xyz",account,"withdraw",10000);
		
		user1.start();
		user2.start();
	}

}
