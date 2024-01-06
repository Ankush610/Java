
public class Val_Args {
	
	public static int add(int ...a)
	{
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
				

	}

	public static void main(String[] args) {
		System.out.println(add(1,5,2,3,4));
		System.out.println(add(1,5,2,5,4));
		

	}

}
