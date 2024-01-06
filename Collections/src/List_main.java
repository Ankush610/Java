import java.util.*;




public class List_main {
	public static void main(String[] args)
	{	
		
		Vector<Integer> v = new Vector<>();
		System.out.println(v.size());
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		System.out.println(v);
		System.out.println(v.size());
		
		for(int val:v) {
			System.out.println(val);
		}
		
		
		System.out.println();
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}
}
