import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// make class serializable to handle ouput read/write 

class Laptop implements Serializable{
	
	private int id;
	private String name;
	//private transient double cost;
	private double cost;
	
	public Laptop(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", cost=" + cost;
	}
}

public class Tester {

	public static void main(String[] args) throws Exception {
		
		// --------------- Open File From Directory ------------------
		
		File file = new File("/home/dai/Documents/fileHand.dat");
		
		// ---------------- Write Object Onto The File ---------------------------
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Laptop(101,"hp",340000));
		oos.writeObject(new Laptop(102,"lenovo",430000));
		fos.close();
		oos.close();
		System.out.println("Object is Saved....");
		
		// ----------------- Read Object From The File ---------------
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
				//  Converting Binary to Object
		Laptop l1 = (Laptop)ois.readObject();
		System.out.println(l1);
		Laptop l2 = (Laptop)ois.readObject();
		System.out.println(l2);
		fis.close();
		ois.close();
		System.out.println("Object is Saved....");
		
		
		
	}

}
