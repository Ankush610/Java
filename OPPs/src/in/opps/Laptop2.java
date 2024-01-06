package in.opps;


public class Laptop2 {
	
	// constructing variables 
	private int srno;
	private String name;
	private int cost;
	private static int cnt; // static variable 
	
	
	// prarmeterized constructor 
	public Laptop2(int srno, String name, int cost) {
		this.srno = srno;
		this.name = name;
		this.cost = cost;
		cnt++;
	}

	// default constructor 
	public Laptop2() {
		
		this.srno = 0;
		this.name = "ASUS";
		this.cost = 50000;
		cnt++;
	}
	
	public static void showCnt()
	{
		System.out.println("No of Objects Created : "+cnt);
	}
	
	// First static block
	static {
		System.out.println("Static Block 1 ");
	}

	
	// getters and setters 
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
	
	
	// Second static block
	static {
		System.out.println("Static Block 2 ");
	}
	
	public String toString() {
		return "Laptop2 [srno=" + srno + ", name=" + name + ", cost=" + cost + "]";
	}

}


