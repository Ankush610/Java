import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class ThreadRead implements Runnable {

	private Thread t1, t2;
	private File file1, file2;
	private String s = "";
	boolean flg;

	public ThreadRead(File f1, File f2) {

		file1 = f1;
		file2 = f2;
		t1 = new Thread(this, "Read");
		t2 = new Thread(this, "Write");
		t1.start();
		t2.start();
	}

	public void run() {
		Scanner sc;
		try {
			sc = new Scanner(file1);
			FileWriter filew = new FileWriter(file2);
			flg = sc.hasNext();
			while (flg) {

				if (Thread.currentThread() == t1) {
					synchronized (this) {
						try {
							s = sc.nextLine();
							notify();
							wait();
							flg = sc.hasNext();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

				}

				if (Thread.currentThread() == t2) {
					synchronized (this) {

						try {
							if (s.equals("")) {
								wait();
							}
							filew.write(s + "\n");
							notify();
							wait(10);

						} catch (Exception e) {
							e.printStackTrace();
						}

					}

				}

			}
			filew.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}

public class Q2_main {

	public static void main(String[] args) throws IOException {

// -------------- File 1 --------------------

		File file = new File("/home/dai/Documents/src.txt");

// ---------------- File 2 -----------------------

		// ---- Create File 2 ------

		File file2 = new File("/home/dai/Documents/dest.txt");

		file2.createNewFile();

		// ---------- Write File 2 -------------

		ThreadRead tr1 = new ThreadRead(file, file2);

	}

}
