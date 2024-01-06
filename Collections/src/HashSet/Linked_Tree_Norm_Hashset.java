
package HashSet;
import java.util.*;

public class Linked_Tree_Norm_Hashset {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		s1.add(9);
		s1.add(2);
		s1.add(7);
		s1.add(4);
		s1.add(19);
		s1.add(22);
		s1.add(37);
		s1.add(44);
		System.out.println("HashSet :");
		System.out.println(s1);
		
		Set<Integer> Ls = new LinkedHashSet();
		Ls.add(9);
		Ls.add(2);
		Ls.add(7);
		Ls.add(4);
		Ls.add(19);
		Ls.add(22);
		Ls.add(37);
		Ls.add(44);
		System.out.println("LinkedHashSet :");
		System.out.println(Ls);
		
		Set<Integer> Ts = new TreeSet();
		Ts.add(9);
		Ts.add(2);
		Ts.add(7);
		Ts.add(4);
		Ts.add(19);
		Ts.add(22);
		Ts.add(37);
		Ts.add(44);
		System.out.println("treeSet :");
		System.out.println(Ts);

	}

}
