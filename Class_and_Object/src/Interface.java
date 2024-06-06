interface C4
{
	void sit();
}

interface C5 extends C4
{
	void stand();
}

class Person implements C5
{
	public void sit()
	{
		System.out.println("Sitting");
	}
	
	public void stand()
	{
		System.out.println("Standing");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.sit();
		p.stand();
	}

}
