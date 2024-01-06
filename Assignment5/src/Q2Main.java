class Vehicle implements Cloneable{
	private int vehnum;
	private String name;
	private int price;
	
	public Vehicle(int venum, String nm, int pre) {
		vehnum = venum;
		name = nm;
		price = pre;
	}
	
	public Vehicle() {
		vehnum = 0;
		name = "None";
		price = 0;
	}
	
	
	public String toString() {
		return "Vehicle Number : " + vehnum + " Name : " + name + " Price : "+ "" + price ;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Q2Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle v1 = new Vehicle(11,"AUDI",200000);
		Vehicle v2 = (Vehicle)v1.clone(); 
		System.out.println(v2);
	}
}
