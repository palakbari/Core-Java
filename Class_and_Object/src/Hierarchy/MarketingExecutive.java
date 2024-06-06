package Hierarchy;

public class MarketingExecutive extends Employee{
	private int km_travelled;
	private int telephone_allowance=2000;
	
	public MarketingExecutive(int id, String name, int s,int kmt, int toa) {
		super(id, name, s);
		this.km_travelled = kmt;
	}
	
	double sal = getSalary();
	double allowance = (5*km_travelled)+(telephone_allowance);
	
	public double calsalaryexe()
	{
		double NetSalary = sal + allowance;
		return NetSalary;
	}
}
