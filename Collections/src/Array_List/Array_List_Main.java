package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class laptop implements Comparable<laptop>{
	private int srno;
	private String name;
	private int cost;
	private int ramsize;
	public laptop(int srno, String name, int cost,int ramsize) {
		
		this.srno = srno;
		this.name = name;
		this.cost = cost;
		this.ramsize = ramsize;
	}
	
	
	public int getSrno() {
		return srno;
	}


	public void setSrno(int srno) {
		this.srno = srno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public int getRamsize() {
		return ramsize;
	}


	public void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}


	public void Display() {
		System.out.println("srno=" + srno + " name=" + name + " cost=" + cost + " RamSize : "+ ramsize);
	}



	@Override
	public int compareTo(laptop o) {
		if(this.cost> o.cost)
			return -1;
		else if (this.cost< o.cost)
			return 1;
		else
			return 0;
	}
}



class CompareLaptops implements Comparator<laptop>{

	public int compare(laptop o1, laptop o2) {
		if(o1.getSrno()>o2.getSrno())
			return 1;
		else if(o1.getSrno()<o2.getSrno())
			return -1;
		else
			return 0;
	}
	
}

class CompareName implements Comparator<laptop>{

	public int compare(laptop o1, laptop o2) {
		return o1.compareTo(o2);
	}
	
}
class CompareRamsize implements Comparator<laptop>{

	public int compare(laptop o1, laptop o2) {
		if(o1.getRamsize() < o2.getRamsize())
			return -1;
		else if(o1.getRamsize() > o2.getRamsize()) 
			return 1;
		else
			return 0;
	}
	
}

public class Array_List_Main {

	public static void main(String[] args) {
		List<laptop> list = new ArrayList<laptop>();
		list.add(new laptop(102,"sgfg",454451,16));
		list.add(new laptop(101,"gcb",45452,2));
		list.add(new laptop(104,"gsdfg",45457853,8));
		list.add(new laptop(103,"sfdgg",45454,4));
		
		for(laptop l:list)
			l.Display();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//		Collections.sort(list);
		
		Collections.sort(list, new CompareLaptops());
		for(laptop l:list)
			l.Display();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Collections.sort(list, new CompareRamsize());
		for(laptop i:list) {
			i.Display();
		}
		System.out.println(new CompareRamsize().compare(new laptop(103,"sfdgg",45454,4),new laptop(103,"sfdgg",45454,56)));
		
		
		
		
		}
}

