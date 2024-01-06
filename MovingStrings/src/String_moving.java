
import java.awt.*; // contains GUI components 

class MovingStrings extends Frame implements Runnable
{
	Thread t1,t2;
	int x1,x2;
	public MovingStrings(){
		super();
		x1 = 100;
		x2 = 100;
		this.t1 = new Thread(this,"DAC");
		this.t2 = new Thread(this,"DAC");
		t1.start();
		t2.start();
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.setFont(new Font("Tahoma",200,200));
		g.drawString("PG-DAI",x1,200); // str.x-cord,y-cord
		g.setColor(Color.RED);
		g.drawString("PG-DAC", x2, 250);
	}

	@Override
	public void run() {
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				x1++;
				if(x1==this.getWidth())
					x1=-250;
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread()==t2)
			{
				x2--;
				if(x2==(-250))
					x2=this.getWidth();
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}repaint();
		}
		
	}
	
}

public class String_moving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingStrings fr = new MovingStrings();
		fr.setSize(600,600);
		fr.setVisible(true);
		

	}

}
