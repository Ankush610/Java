import java.util.Scanner;

class AccountHolder {
	private int acc_no;
	private String name;
	private int Bal;
	private static int cnt=0;
	
	public AccountHolder(int acc_no, String name, int bal) {
		this.acc_no = acc_no;
		this.name = name;
		Bal = bal;
		cnt++;
	}
	
	public static int cnt() {
		return cnt;
	}
	
	public AccountHolder() {
		this(0,"None",000);
		cnt++;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBal() {
		return Bal;
	}

	public void setBal(int bal) {
		Bal = bal;
	}

	public String toString() {
		return "acc_no=" + acc_no + ", name=" + name + ", Bal=" + Bal ;
	}
	
	public int deposit(int acc_no,String Name,int amm)
	{
		this.Bal = this.Bal+amm;
		return Bal;
	}
	
	public int withdrawl(int acc_no,String Name,int amm)
	{
		this.Bal = this.Bal-amm;
		return Bal;
	}
	
	
	
}

public class Q1 {

	public static void main(String[] args) {
		AccountHolder [] lst = new AccountHolder [10];
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Add record for account holder\n"
					+ "2. Display details of all account holders.\n"
					+ "3. Deposite an amount into perticular account\n"
					+ "4. Withdraw an amount from perticular account\n"
					+ "5. to Exit"
					+ "Enter Choice : ");
			int ch = sc.nextInt();
			if(ch==5) {
				System.out.println("Thank you for visiting");
				break;
			}
				
			switch(ch) {
			case 1:
				System.out.println("Enter Account number");
				int Ac_no = sc.nextInt();
				System.out.println("Enter Account holder name");
				String Name = sc.next(); 
				System.out.println("Enter Account Balance");
				int balance = sc.nextInt();
				int x = AccountHolder.cnt();
				if (x==10)
				{
					System.out.println("Limit reached");
					break;
				}
				
				AccountHolder A = new AccountHolder(Ac_no,Name,balance);
				lst[x] = A;
				break;
				
			case 2:
				x = AccountHolder.cnt();
				System.out.println("Account holder details :- ");
				for(int i =0;i<x;i++)
				{
					System.out.println(lst[i]);
				}
				break;
			case 3:
				x = AccountHolder.cnt();
				System.out.println("Enter Account number");
				Ac_no = sc.nextInt();
				System.out.println("Enter Account Balance");
				balance = sc.nextInt();
				for(int i=0;i<x;i++) {
					if (lst[i].getAcc_no()==Ac_no)
					{
						String name = lst[i].getName();
						int new_bal = lst[i].deposit(Ac_no, name, balance);
						System.out.println("your new balance is"+new_bal);
					}
				}
				break;
			case 4:
				x = AccountHolder.cnt();
				System.out.println("Enter Account number");
				Ac_no = sc.nextInt();
				System.out.println("Enter Account Balance");
				balance = sc.nextInt();
				for(int i=0;i<x;i++) {
					if (lst[i].getAcc_no()==Ac_no)
					{
						String name = lst[i].getName();
						int new_bal = lst[i].withdrawl(Ac_no, name, balance);
						System.out.println("your new balance is"+new_bal);
					}
				}
				break;
			
		
			}
		
		}

	}

}
