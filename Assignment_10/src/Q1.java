// contains GUI components 
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MovingCircle extends Frame implements Runnable
{
	Thread t1;
	int x1,i;
	public MovingCircle(){
		
		x1 = 100;
		i = 1;
		
		this.t1 = new Thread(this,"DAC");
		t1.start();
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillOval(x1, 50, 200, 200);
	}

	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				if(i==1) {
					x1++;
					if(x1==this.getWidth()-200) {
					
						i=0;
					}
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else if(i==0) {
					x1--;
					if(x1==0) {
			
						i=1;					
					}
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}repaint();
		}
		
	}
	
}

class DancingCircle extends Frame implements Runnable
{
	Thread t1;
	int x,y,i;
	public DancingCircle(){
		
		x = 40;
		y = 40;
		i = 1;
		
		this.t1 = new Thread(this,"DAC");
		t1.start();
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, 50, 50);
		g.setColor(Color.MAGENTA);
		g.fillOval(y, x, 50, 50);
		g.setColor(Color.CYAN);
		g.fillOval(x, x, 50, 50);
		g.setColor(Color.pink);
		g.fillOval(y, y, 50, 50);
		g.setColor(Color.RED);
		g.fillOval(y, 300, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(300, y, 50, 50);
	}

	@Override
	public void run() {
		while(true)
		{

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			if(Thread.currentThread()==t1)
			{
				if(i==1) {
					x++;
					y++;
					if(x>=this.getWidth()-50 && y>=this.getHeight()-50)
						i=2;
				}
				if(i==2) {
					y--;
					if(x>=this.getWidth()-50 && y<=40)
						i=3;
				}
				else if(i==3) {
					x--;
					y++;
					if(y>=this.getHeight()-50 && x<=40) 
						i=4;
				}
				else if(i==4) {
					y--;
					if(x<=40 && y<=40)
						i=1;					
				}
			}repaint();
		}
		
	}
	
	
}




public class Q1 {

	public static void main(String[] args) {
		MovingCircle fr = new MovingCircle();
		fr.setSize(800,800);
		fr.setVisible(true);
//		DancingCircle fr1 = new DancingCircle();
//		fr1.setSize(800,800);
//		fr1.setVisible(true);
//		fr1.addWindowListener(new WindowAdapter() {
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
	}
});
	}

}

