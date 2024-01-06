package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class map_main {

	public static void main(String[] args) {
		Map<Integer,String> s = new TreeMap<>();
		s.put(11,"hfdui");
		s.put(12,"hfdui");
		s.put(9,"hfdui");
		s.put(8,"hfdui");
		s.put(12,"hfdui");
		s.put(11,"hfdui");
		
		
		System.out.println(s);
		Set<Integer> k = s.keySet();
		for(Integer key:k)
			System.out.println(key+" "+s.get(key));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Map<Integer,String> Ls = new LinkedHashMap<>();
		Ls.put(11,"hfdui");
		Ls.put(12,"hfdui");
		Ls.put(9,"hfdui");
		Ls.put(9,"hfdui");
		Ls.put(19,"hfdui");
		
		Ls.put(8,"hfdui");
		Ls.put(12,"hfdui");
		Ls.put(11,"hfdui");
		
		
		System.out.println(Ls);
		Set<Integer> k1 = Ls.keySet();
		for(Integer key:k1)
			System.out.println(key+" "+Ls.get(key));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Map<Integer,String> Ts = new HashMap<>();
		Ts.put(11,"hfdui");
		Ts.put(12,"hfdui");
		Ts.put(9,"hfdui");
		Ts.put(9,"hfdui");
		Ts.put(19,"hfdui");
		Ts.put(null,null);
	
		Ts.put(8,"hfdui");
		Ts.put(12,"hfdui");
		Ts.put(11,"hfduix");
		
		
		System.out.println(Ts);
		Set<Integer> k2 = Ts.keySet();
		for(Integer key:k2)
			System.out.println(key+" "+Ts.get(key));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Map<Integer,String> Tb = new Hashtable<>();
		Tb.put(11,"hfdui");
		Tb.put(12,"hfdui");
		Tb.put(9,"hfdui");
		Tb.put(9,"hfdui");
		Tb.put(19,"hfdui");
		//Tb.put(null,null);
		Tb.put(8,"hfdui");
		Tb.put(12,"hfdui");
		Tb.put(11,"hfduix");
		
		
		System.out.println(Tb);
		Set<Integer> k3 = Tb.keySet();
		for(Integer key:k3)
			System.out.println(key+" "+Tb.get(key));
	}

}
