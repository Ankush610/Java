import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;



class Number{
	private int num;

	public Number(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return ""+num;
	}
	
}



public class Main {
	public static void main(String[] args) {
		
		
		
		LocalDate date = LocalDate.now(); // To get Current Date 
		
		LocalDate Olddate = LocalDate.parse("2021-12-03"); 
		
		
		System.out.println(date);
		System.out.println(Olddate);		
		System.out.println(ChronoUnit.MONTHS.between(Olddate,date));		
		
		List<Integer> ar = new ArrayList<>();
		ar.add(11);
		ar.add(12);
		ar.add(13);
		
		Iterator itr = ar.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
