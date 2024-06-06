import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class Circle extends Frame implements Runnable
{
	private int x1,x2,x3;
	private Thread t1,t2,t3;
	
	public Circle()
	{
		x1=x2=x3=100;
		t1 = new Thread (this,"red");
		t2 = new Thread (this,"yellow");
		t3 = new Thread (this,"green");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(x1, 100, 100, 100);
		g.setColor(Color.YELLOW);
		g.fillOval(x2, 250, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(x3, 350, 100, 100);
	}
	
	public void run() 
	{
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				synchronized (this)
				{
					x1++;
					if(x1==this.getWidth()-100)
						try
					{
							wait();
					}
					catch(Exception e)
					{
						
					}
				}
				try
				{
					Thread.sleep(20);
				}
				catch(Exception e)
				{
					
				}
			}
			else if(Thread.currentThread()==t2)
			{
				synchronized (this)
				{
					x2++;
					if(x2==this.getWidth()-100)
						try
					{
							wait();
					}
					catch(Exception e)
					{
						
					}
				}
				try
				{
					Thread.sleep(40);
				}
				catch(Exception e)
				{
					
				}
			}
			else if(Thread.currentThread()==t3)
			{
				synchronized (this)
				{
					if(x3==this.getWidth()-100)
					{
						x1=x2=x3=0;
						notifyAll();
					}
				}
				try
				{
					Thread.sleep(60);
				}
				catch(Exception e)
				{
					
				}
				x3++;
			}
			repaint();
		}
	}	
}


public class MultithreadingCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setSize(600,600);
		c.setVisible(true);
	}

}
