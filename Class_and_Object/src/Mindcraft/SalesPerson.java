package Mindcraft;

public class SalesPerson extends WageEmployee {
	private int sales;
	private int commission;
	
	public SalesPerson() {
		super();
		sales=10;
		commission=100;
	}
	
	public SalesPerson(int empid, String empname,int d,int m,int y,int h, int r,int s,int c) {
		super(empid,empname,d,m,y,h,r);
		sales = s;
		commission = c;
	}
	
	public int calsalary()
	{
		return sales*commission;
	}
	
	public void show()
	{
		System.out.println("Sales:"+sales+"\nCommission:"+commission);
		super.show();
	}
}
