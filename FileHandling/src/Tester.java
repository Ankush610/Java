import java.io.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		//-------------- Giving File Path --------------
		File file = new File("/home/dai/Documents/file.txt");
		
		//------------- Creating New File --------------------
		try {
			file.createNewFile();
			System.out.println("File Created...");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//----------- Writing Into The File -----------
		
		try {
			FileWriter fileWriter = new FileWriter(file,true);
			fileWriter.write("\nPuneet Superstar");
			fileWriter.write("\nPuneet");
			fileWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		//------------ Reading File Into Terminal -----
		try {
			char [] s = new char[100];
			
			FileReader fileReader = new FileReader(file);
			fileReader.read(s);
			System.out.println(s);
			fileReader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		//---------------- ----------
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String str = sc.nextLine();
				
				System.out.println(str);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
