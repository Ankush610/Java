import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1_Main {

	public static void main(String[] args) throws IOException {
		
// -------------- File 1 --------------------
		
		File file = new File("/home/dai/Documents/src.txt");
		
		//------ Create Files ----
		
		file.createNewFile();
		
		//----- Write File ----
		
		FileWriter fileW = new FileWriter(file);
		
		fileW.write("This Is The Content..");
		
		fileW.close();
		
		//----- Read File ------
		
		char [] s = new char[100];
		
		FileReader fileR = new FileReader(file);
		
		fileR.read(s);
		
		System.out.println(s);
		
// ---------------- File 2 -----------------------
		
		// ---- Create File 2 ------
		
		File file2 = new File("/home/dai/Documents/dest.txt");
		
		file2.createNewFile();
		
		// ---------- Write File 2 -------------
		
		FileWriter fileW2 = new FileWriter(file2);
		
		fileW2.write(s); // s has content of file 1 
		fileW2.close();
		
		//----------- File Read2 --------------
		
		char [] s2 = new char[100];
		
		FileReader fileR2 = new FileReader(file2);
		
		fileR2.read(s2);
		
		System.out.println(s2);
		
		
	}

}
