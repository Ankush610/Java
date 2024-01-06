package HashSet;
import java.util.*;

public class HashSet_main {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(11);
		s.add(12);
		s.add(9);
		s.add(8);
		s.add(12);
		s.add(11);
		
		
		System.out.println(s);
		
		Set<Integer> Ls = new LinkedHashSet<>();
		Ls.add(11);
		Ls.add(12);
		Ls.add(9);
		Ls.add(9);
		Ls.add(19);
		
		Ls.add(8);
		Ls.add(12);
		Ls.add(11);
		
		
		System.out.println(Ls);
		
		
		Set<Integer> Ts = new TreeSet<>();
		Ts.add(11);
		Ts.add(12);
		Ts.add(9);
		Ts.add(9);
		Ts.add(19);
		
		Ts.add(8);
		Ts.add(12);
		Ts.add(11);
		
		
		System.out.println(Ts);
		
		
	}

}
