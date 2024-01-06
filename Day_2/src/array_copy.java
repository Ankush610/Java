
public class array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {6,7,8,9,10};
		int [] b = new int[3];
		
		System.arraycopy(a, 3, b, 0, 3);
		
		
		for(int val:b) {
			System.out.print(val+" ");
		}
	}

}
