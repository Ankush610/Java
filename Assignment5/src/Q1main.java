
interface printable{
	public void printDetails(); 
}

class CktPlayer implements printable{
	private String name;
	private int runs;
	
	CktPlayer(String nm,int run){
		name = nm;
		runs = run;
	}
	
	CktPlayer(){
		name = "None";
		runs = 0;
	}
	
	public void printDetails() {
		System.out.println("Name : "+name+" Runs : "+runs);
	}
	
}

class FtPlayer implements printable{
	private String name;
	private int goals;
	
	FtPlayer(String nm,int run){
		name = nm;
		goals = run;
	}
	
	FtPlayer(){
		name = "None";
		goals = 0;
	}
	
	public void printDetails() {
		System.out.println("Name : "+name+" Runs : "+goals);
	}
	
}

public class Q1main {

	public static void main(String[] args) {
		printable f1 = new FtPlayer("dsd",232);
		f1.printDetails();
		printable f2 = new CktPlayer("dsd",4983);
		f2.printDetails();

	}

}
