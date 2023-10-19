class student
{
	private int rol;
	private String name; 
	private int per;
	
	private static int cnt = 100;

	public student( String name, int per) {
		cnt++;
		this.rol = cnt;
		this.name = name;
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public int getRol() {
		return rol;
	}

	@Override
	public String toString() {
		return "rol=" + rol + ", name=" + name + ", per=" + per;
	}
	
	
	
	
	
}
public class Q2_3 {

	public static void main(String[] args) {
		student s1 = new student("Puneet", 99);
		student s2 = new student("Ankush", 100);
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
