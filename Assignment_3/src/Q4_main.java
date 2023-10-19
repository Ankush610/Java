import com.cdac.pack1.Student;
import com.cdac.pack2.Batch;
public class Q4_main {

	public static void main(String[] args) {
		Student s1 = new Student("Puneet");
		Batch B1 = new Batch("DAI", 39);
		Student s2 = new Student("Ankush");
		Batch B2 = new Batch("DAI", 39);
		System.out.println(s1.Display()+" "+B1.Display());
		System.out.println(s2.Display()+" "+B2.Display());
		
		
	}

}
