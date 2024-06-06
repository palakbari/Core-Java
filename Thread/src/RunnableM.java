import java.util.Scanner;

class myThread1 implements Runnable
{
	private Thread t1;
	int a;
	
	public myThread1(int a)
	{
		this.a=a;
		t1 = new Thread (this);
		t1.start();
	}
	public void run() 
	{
		for(int i=a;i<a+10;i++)
		{
			if(Thread.currentThread()==t1)
			{
				System.out.println("Addition:"+i);
			}
		}
	}	
}

class myThread2 implements Runnable
{
	private Thread t2;
	int a;
	
	public myThread2(int a)
	{
		this.a=a;
		t2 = new Thread (this);
		t2.start();
	}
	public void run() 
	{
		for(int i=a;i<a+10;i++)
		{
			if(Thread.currentThread()==t2)
			{
				System.out.println("Multiplication:"+a+"*"+i+"="+a*i);
			}
		}
	}	
}

public class RunnableM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value for Addition:");
			a=sc.nextInt();
			System.out.println("Enter value for Multiplication:");
			b=sc.nextInt();
			new myThread1(a);
			new myThread2(b);
			
			
	}

}
