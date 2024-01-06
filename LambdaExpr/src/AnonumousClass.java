
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Created an Interface A

interface A {
	public void show();
}

//Created an Interface A

interface B {
	public void show();
}

public class AnonumousClass {

	public static void main(String[] args) {
		
		// Anonymous Class - Implementing Interface A 
		
		A a = new A() {
			@Override
			public void show() {
				System.out.println("Testing Anonymous Class!");
			}
		};
		
		// Lambda Class - Implementing Interface B 
		
		B b = () -> System.out.println("Lambda Implementation ! ");
		
		a.show();
		b.show();
		
		// ------- Inbuilt Lambda Expression Created of Inbuilt Interface --------------------------------
		
		List<Integer> list = Arrays.asList(12,323,23,23,30);
		list.forEach((x) -> System.out.print(x+" "));
		System.out.println();
		
		//---------------- Creating Stream API ------------------------
		
		
		Stream<Integer> stream = list.stream();
		
		
		
		//long cnt = stream.count();
		//System.out.println("No of values : "+cnt);
		
		//stream.forEach((x) -> System.out.println(x+" "));
		
		list.stream().map((t)->t*2).forEach((t)-> System.out.print(t+" "));
		System.out.println();
		list.stream().filter((t)->t%2==0).forEach((t)-> System.out.print(t+" "));
		
		Stream<Integer> stream1 = list.stream();
		
		}

}

