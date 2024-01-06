class Laptop1
{
	private String name;
	private String make;
	private double cost;
	
	
	// This is a constructor
	public Laptop1(){
		// default values initialzed in constructor 
		this("dell", "Indian",2500000);
	}
	
	//Parameterized constructor 
	public Laptop1(String val1,String val2,double val3) {
		this.name = val1;
		this.make = val2;
		this.cost = val3;
	}
	
	
	
	// to display  
	public String toString()
	{
		return name+" "+make+" "+cost;
	}
}


class Laptop2 {
	
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
	}

	
	// default constructor 
	public Laptop2() {
		
		this.srno = 0;
		this.name = "ASUS";
		this.cost = 50000;
		cnt++;
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
public class Getters_Setters {

	public static void main(String[] args) {
	Laptop1 lp1 = new Laptop1();
	Laptop1 lp2 = new Laptop1("Razor","USA",80000);
	Laptop2 lp21 = new Laptop2();
	Laptop2 lp22 = new Laptop2(12,"USA",80000);
	
	System.out.println(lp21);
	System.out.println(lp22);
	System.out.println(lp1);
	System.out.println(lp2);
	}

}
