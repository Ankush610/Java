class Laptop
{
	private String name,df1;
	private int make,df;
	private int cost;
	
	// This is a constructor
	public Laptop(){
		// default values initialzed in constructor 
		name = "hp";
		make = 100;
		cost = 200;	
	}
	
	//Parameterized constructor 
	public Laptop(String val1,int val2,int val3) {
		name = val1;
		make = val2;
		cost = val3;
	}
	
	
	public Laptop(String val1,int val2) {
		name = val1;
		make = val2;
		
	}
	
	public Laptop(String val1) {
		this();
		name = val1;
		
	}
	
	
	// to display  
	public String toString()
	{
		return name+" "+make+" "+cost;
	}
}

public class Abstraction_Encapsulation {

	public static void main(String[] args) {
	Laptop lp1 = new Laptop("Ankush");
	//Laptop lp2 = new Laptop("Razor",2022,80000);
	System.out.println(lp1);
	//System.out.println(lp2);
	}

}
