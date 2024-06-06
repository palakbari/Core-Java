package Mindcraft;

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	public Date()
	{
		dd=31;
		mm=04;
		yyyy=1991;
	}
	public Date(int d, int m, int yy) {
		dd = d;
		mm = m;
		yyyy = yy;
	}
	
	public void show()
	{
		System.out.println("Date:"+dd+"."+mm+"."+yyyy);
	}
	
}
