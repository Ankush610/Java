package in.cdac;

public class Date {
	private int dd , mm, yy;

	public Date(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	public Date() {
		dd = 1;
		mm = 1;
		yy = 2000;
	}
	
	public void show() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
		

}


