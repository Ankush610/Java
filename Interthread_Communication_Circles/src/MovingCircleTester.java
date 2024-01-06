import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MovingCircle extends Frame implements Runnable {

	private int x1, x2, x3;
	private Thread t1, t2, t3;

	public MovingCircle() {
		x1 = x2 = x3 = 100;
		t1 = new Thread(this, "red");
		t2 = new Thread(this, "orange");
		t3 = new Thread(this, "green");
		t1.start();
		t2.start();
		t3.start();
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x1, 100, 100, 100);

		g.setColor(Color.ORANGE);
		g.fillRect(x2, 300, 100, 100);

		g.setColor(Color.GREEN);
		g.fillRect(x3, 500, 100, 100);

	}

	@Override
	public void run() {
		while (true) {
			repaint();
			
			
			if (Thread.currentThread() == t1) {
				x1++;

				if (x1 == this.getWidth() - 100)
					synchronized (this) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			else if (Thread.currentThread() == t2) {
				x2++;

				if (x2 == this.getWidth() - 100)
					synchronized (this) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}

				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			else if (Thread.currentThread() == t3) {
				x3++;

				if (x3 == this.getWidth() - 100)
					synchronized (this) {
							notifyAll();
							x1=x2=x3=0;
					}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

		}
	}
}

public class MovingCircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingCircle c = new MovingCircle();
		c.setSize(800, 800);
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});
	}
}