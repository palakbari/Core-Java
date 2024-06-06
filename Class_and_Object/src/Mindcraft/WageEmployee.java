package Mindcraft;

public class WageEmployee extends Employee{
	
	private int hour;
	private int rate;
	
	public WageEmployee() {
		super();
		hour = 5;
		rate = 500;
	}

	public WageEmployee(int empid, String empname,int d,int m,int y,int h, int r) {
		super(empid,empname,d,m,y);
		hour = h;
		rate = r;
	}
	
	public int calsalary()
	{
		return hour*rate;
	}
	public void show()
	{
		System.out.println("Hour:"+hour+"\nRate:"+rate);
		super.show();
	}
}
