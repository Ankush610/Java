import in.Q2Emp.Salesp;
import in.Q2Emp.WageEmp;

public class Q2main {

	public static void main(String[] args) {
		Salesp s1 = new Salesp(1,"TATA",23,9,2023,20,200,200000,500);
		System.out.println(s1.show());
		System.out.println("saleses Person Salary :"+s1.Salary());
		System.out.println("-=-==-===-=-=--=-=-=-=-=-=-=-=-=-=-==-");
		WageEmp we1 = new WageEmp(24,"puneet",10,6,2024,20,450);
		System.out.println(we1.show());
		System.out.println("WageEmp Salary :"+we1.Salary());
	}
}


