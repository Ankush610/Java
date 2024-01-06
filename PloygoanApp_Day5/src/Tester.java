

class Circle1 implements Cloneable{
	private int radius;
	
	Circle1(int r){
		radius = r;
	}
	
	Circle1(){
		radius = 1;
	}
	
	public double CalcArea() {
		return 3.14*radius*radius;
	}
	
	public double CalcPeri() {
		return 2*3.14*radius;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class Tester{

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle1 p1 = new Circle1(11);
		System.out.println(p1.CalcArea());
		System.out.println(p1.CalcPeri());
		Circle1 c1 = new Circle1(11);
		Circle1 c2 = (Circle1)c1.clone();
		System.out.println(c2.CalcArea());
		System.out.println(c2.CalcPeri());
		
		
	
	}

}



