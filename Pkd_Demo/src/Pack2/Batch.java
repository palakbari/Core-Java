package Pack2;

public class Batch {
	int b_strength;
	String c_name;
	public Batch(int b,String c)
	{
		b_strength=b;
		c_name=c;
	}
	public void disp()
	{
		System.out.println("Course Name:"+c_name);
		System.out.println("Batch Name:"+b_strength);
	}
}
