
public class Math {
	
	public int add(int x,int y)
	{
		return (x+y);
	}
	
	public int add(int x,int y,int z)
	{
		return (x+y+z);
	}
	
	public static void main(String[] args)
	{
		Math m = new Math();
		System.out.println(m.add(45,18));
		System.out.println(m.add(45,18,07));
	}
}