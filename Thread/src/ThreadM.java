

class Thread1 extends Thread
{
	public void run()
	{
	int i;
	for (i=0;i<100;i++)
		{
			System.out.println("Thread1 "+i);
		}
	}
	
}

class Thread2 extends Thread
{
	public void run()
	{
	int i;
	for (i=0;i<100;i++)
		{
			System.out.println("Thread2");
		}
	}
}


public class ThreadM 
{
	public static void main(String args[])
	{
	Thread1 t1 = new Thread1();
	t1.start();
	Thread2 t2 = new Thread2();
	t2.start();
	}
}
