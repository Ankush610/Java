class my_exp extends Exception{
	String Massage;

	public my_exp(String massage) {
		Massage = massage;
	}

	@Override
	public String toString() {
		return Massage;
	}
	
}

public class user_defines_exception {
	
	public static double divide(int num, int den) throws my_exp{
		if(den==0)
			throw new my_exp("Denominator is zero");
		return (double)num/den;
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(12, 0));
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
