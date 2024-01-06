class Stack<G>{
	private int size;
	private G []arr;
	private int top;
	public Stack()
	{
		size = 5;
		arr = (G[])new Object[size];
		top = -1;
	}
	
	public Stack(int s)
	{
		size = s;
		arr = (G[])new Object[size];
		top = -1;
	}
	
	public void push(G val)
	{
		if(!isfull())
			arr[++top]=val;
		else
			System.out.println("Stack is full");
	}
	
	public G pop()
	{
		if(!isempty())
			return arr[top--];
		else {
			System.out.println("Stack is Empty");
			return null;
		}
		
		
	}
	
	public boolean isfull()
	{
		return top == size-1;
	}
	
	public boolean isempty()
	{
		return top == -1;
		
	}
	
}


public class Stack_DS_FILO {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>(5);
		s1.push(20);
		s1.push(10);
		s1.push(40);
		s1.push(60);
		s1.push(50);
		s1.push(50);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		

	}

}
