package in.Assign12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Read_Write_DAT {
	private ArrayList<Account> arr;
	private String path;
	private File file;

	public Read_Write_DAT(String ph) {
		this.path = ph;
		this.file = new File(path);
	}

	public ArrayList<Account> read() throws Exception {
		ArrayList<Account> arr1 = new ArrayList<>();
		FileInputStream fis = new FileInputStream(this.file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
				
		arr = (ArrayList<Account>)ois.readObject();
		fis.close();
		ois.close();
		return arr;
		
	}
//		FileInputStream fis = new FileInputStream(this.file);
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		int i =0;
//
//		while (i<10) {
//			i++;
//			System.out.println("dfghhg");
//			arr1.add((Account)ois.readObject());
////			arr1.add(ac);
//			
//			
//		}
//		fis.close();
//		ois.close();
//		return arr1;
//
//	}

	public void write(ArrayList<Account> arr) {
		try {
//			this.file.createNewFile();

//			FileOutputStream fos = new FileOutputStream(this.file);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(arr);
//			fos.close();
//			oos.close();
//			System.out.println("Object is Saved....");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
			FileOutputStream fos = new FileOutputStream(this.file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arr);
			fos.close();
			oos.close();
			System.out.println("Object is Saved....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
