package Hierarchy;

public class Manager extends Employee{
	
	public Manager(int id, String name, int s) 
	{
		super(id, name, s);
	}
	
	double sal = getSalary();
	double allowance = (0.08*sal)+(0.12*sal)+(0.04*sal);
	
	public double calSalaryManager()
	{
		double GrossSalary = sal+allowance;
		double NetSalary = GrossSalary-(0.125*sal);
		return NetSalary;
	}

}
