
abstract class Polygon{
	public abstract double CalcArea();
	public abstract double CalcPeri();
	
}

class Circle extends Polygon{
	private int radius;
	
	Circle(int r){
		radius = r;
	}
	
	Circle(){
		radius = 1;
	}
	
	public double CalcArea() {
		return 3.14*radius*radius;
	}
	
	public double CalcPeri() {
		return 2*3.14*radius;
	}
}

class Rectangle extends Polygon{
	private int len,brd;
	
	Rectangle(){
		len =brd=0;
	}
	
	Rectangle(int l,int b){
		len = l;
		brd = b;
	}
	
	public double CalcArea() {
		return len*brd;
	}
	public double CalcPeri() {
		return 2*(len+brd);
	}
}

class Square extends Rectangle{
	Square(){
		super();
	}
	
	Square(int side){
		super(side,side);	
	}
	
	public double CalcArea() {
		return super.CalcArea();
	}
	
	public double CalcPeri() {
		return super.CalcPeri();
	}
}


public class PolygoanApp {

	public static void main(String[] args) {
		Polygon p1 = new Square(10);
		System.out.println(p1.CalcArea());
		System.out.println(p1.CalcPeri());
	
	}

}


