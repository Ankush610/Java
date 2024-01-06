package in.assign9;

public class Myexp extends Exception {
	String Massage;

	public Myexp(String massage) {
		Massage = massage;
	}

	@Override
	public String toString() {
		return Massage;
	}
	
}

