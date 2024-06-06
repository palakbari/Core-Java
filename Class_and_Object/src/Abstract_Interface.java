interface I1
{
	void fly();
}

abstract class A1
{
	abstract void sit();
	
	void stand()
	{
		System.out.println("Stand");
	}
}

class C1 extends A1 implements I1
{
	public void fly()
	{
		System.out.println("Flying");
	}
	void sit()
	{
		System.out.println("Sit");
	}
}
class Abstract_Interface 
{
	public static void main(String args[])
	{
		C1 c = new C1();
		c.fly();
		c.sit();
		c.stand();
	}
	
}
