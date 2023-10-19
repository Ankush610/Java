import Q3.Manager;
import Q3.MarketExecutive;

public class Q3main {

	public static void main(String[] args) {
		Manager m1 = new Manager(11,"abc",10000);
		System.out.println(m1.toString());
		System.out.println(m1.getSalary());
		System.out.println(m1.Net_Salary());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		MarketExecutive mk1 = new MarketExecutive(12,"pqr",10000,100);
		System.out.println(mk1.toString());
		System.out.println(mk1.getSalary());
		System.out.println(mk1.Net_Salary());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}

}
