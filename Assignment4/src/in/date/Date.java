package in.date;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public Date() {
		dd = 1;
		mm = 1;
	    yy = 2020;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public String display() {
		return dd+"/"+mm+"/"+yy;
	}
	
	

}
