package Hashcode_Equales;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class product implements Comparable<product>{
//class product {
	private int pid;
	private String name;
	private double cost;
	public product(int pid, String name,double cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
	}
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, pid,cost);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		product other = (product) obj;
//		return Objects.equals(name, other.name) && pid == other.pid;
//	}

	public void Display() {
		System.out.println("pid=" + pid + ", name=" + name + ", cost=" + cost);
	}


	public int getPid() {
		return pid;
	}


	@Override
	public int compareTo(product o) {
		if(this.pid>o.pid)
		{
			return 1;
		}
		else if(this.pid<o.pid )
			return -1;
		else 
			return 0;
		
	}
	
	


}

public class Hashcode_And_Equales_main {

	public static void main(String[] args) {
		
		Set<product> s = new HashSet<>();
		s.add(new product(20,"dgf",45774));
		s.add(new product(220,"dgf",4574));
		s.add(new product(20,"dgf",4554));
		s.add(new product(220,"dgf",4574));
		for (product v:s) {
			v.Display();
		}
		
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Set<product> Ts = new TreeSet<>();
		Ts.add(new product(210,"dgff",454));
		Ts.add(new product(2120,"dgf",4564));
		Ts.add(new product(210,"dgf",4547));
		Ts.add(new product(2120,"dgf",4354));
		for (product v:Ts) {
			v.Display();
		}
		
	}

}
