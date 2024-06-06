abstract class AC11
{
	abstract void sit();
	
	public void stand()
	{
		System.out.println("Standing");
	}
}

abstract class AC2 extends AC11
{
	abstract void sleep();
	
	public void wake()
	{
		System.out.println("Awake");
	}
}

class Human extends AC2
{
	void sleep()
	{
		System.out.println("Sleeping");
	}

	
	void sit() 
	{
		System.out.println("Sitting");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human p = new Human();
		p.sit();
		p.stand();
		p.sleep();
		p.wake();
	}

}
