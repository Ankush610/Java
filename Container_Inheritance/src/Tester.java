import in.cdac.Date;
import in.cdac.Employee;
import in.cdac.WageEmployee;

public class Tester {

	public static void main(String[] args) {
		Employee emp1 = new Employee(102,"Jay",23,10,1990);
		emp1.show();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		WageEmployee we1 = new WageEmployee(101,"jay",23,10,1990,10,900);
		we1.show();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}

}
