import in.Assign12.*;
import in.Assign12.Account;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Q1_Main {

	public static void main(String[] args) throws Throwable {
		ArrayList<Account> arr1 = new ArrayList<>();
		ArrayList<Account> arr2 = new ArrayList<>();
		String path = "/home/dai/Documents/Account_Data_A12.dat";
		Read_Write_DAT rw = new Read_Write_DAT(path);
		int Id;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("1.Add Record\n"
					+ "2.Read all Records\n"
					+ "3.deposit\n"
					+ "4.Withdraw\n"
					+ "5.All Account below 20000\n"
					+ "6.Exit");
			int ch = sc.nextInt();
			if(ch==6) {
				sc.close();
				System.out.println("Thank You......");
				break;
			}
			switch(ch) {
			case 1:
				System.out.println("Enter ID");
				int id = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Balance");
				int bal = sc.nextInt();
				Account acc = new Account(id, name, bal);
				arr1.add((Account) acc);
				rw.write(arr1);
				arr1.clear();
				break;
				
			case 2:
				arr1 = rw.read();
				arr1.forEach((x)-> System.out.print(x+"\n"));
				arr1.clear();
				break;
			case 3:
				arr1 = rw.read();
				System.out.println("Enter the Account number");
				Id = sc.nextInt();
				for(Account ac:arr1) {
					if(ac.getId()==Id) {
						System.out.println("Enter Ammount to Deposit");
						int val = 
								sc.nextInt();
						ac.deposite(val);
						arr2.add(ac);
					}
					else
						arr2.add(ac);
				}
				rw.write(arr2);
				arr1.clear();
				arr2.clear();
				break;
			case 4:
				arr1 = rw.read();
				System.out.println("Enter the Account number");
				Id = sc.nextInt();
				for(Account ac:arr1) {
					if(ac.getId()==Id) {
						System.out.println("Enter Ammount to Withdraw");
						int val = sc.nextInt();
						ac.withdraw(val);
						arr2.add(ac);
					}
					else
						arr2.add(ac);
				}
				rw.write(arr2);
				arr1.clear();
				arr2.clear();
				break;
				
			case 5:
				arr1 = rw.read();
				for(Account ac:arr1) {
					if(20000>=ac.getBalance()) 
					{
						System.out.println(ac);
					}
				}
				break;
			}
		}

	}

}
;