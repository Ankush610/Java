import in.Q2Emp.Salesp;
import in.Q2Emp.WageEmp;

public class Q2main {

	public static void main(String[] args) {
		Salesp s1 = new Salesp(1,"TATA",23,9,2023,20,200,200000,500);
		System.out.println(s1.show());
		System.out.println("saleses Person Salary :"+s1.SalesSalary());
		System.out.println("-=-==-===-=-=--=-=-=-=-=-=-=-=-=-=-==-");
		System.out.println("WageEmp Salary :"+s1.WESalary());
		System.out.println(s1);
	}
}


