import java.util.Scanner;

import in.assign9.Account;
import in.assign9.Account.*;
import in.assign9.Myexp;


public class Q1_main {

	public static void main(String[] args) throws Myexp {
		Account a1 = new Account(5000);
		try {
			a1.deposite(8000);
			a1.withdraw(15001);
			a1.withdraw(14000);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		try {
			a1.withdraw(14000);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
