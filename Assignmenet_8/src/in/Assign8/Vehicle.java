package in.Assign8;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
	private int Vnum;
	private String Vname;
	private double Vcost;
	
	public Vehicle(int vnum, String vname, double vcost) {
		super();
		Vnum = vnum;
		Vname = vname;
		Vcost = vcost;
	}
	
	
	public double getVcost() {
		return Vcost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Vcost, Vname, Vnum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Double.doubleToLongBits(Vcost) == Double.doubleToLongBits(other.Vcost)
				&& Objects.equals(Vname, other.Vname) && Vnum == other.Vnum;
	}


	public String toString() {
		return "Vnum=" + Vnum + ", Vname=" + Vname + ", Vcost=" + Vcost;
	}


	@Override
	public int compareTo(Vehicle o) {
		if(this.Vcost>o.getVcost())
			return 1;
		else if(this.Vcost<o.getVcost())
			return -1;
		else
			return 0;
	}	
	
	
}
