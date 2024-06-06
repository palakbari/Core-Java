package Hierarchy;


public class Employee {
	private int emp_id;
	private String emp_name;
	private double basic_salary;
	private static int i;
	static
	{
		i=0;
	}
	
	public Employee(int emp_id, String emp_name, double basic_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.basic_salary = basic_salary;
		i++;
	}

	protected double getSalary()
	{
		return basic_salary;
	}
	
	protected void setSalary(double salary)
	{
		this.basic_salary = salary;
	}
	public void display()
	{
		System.out.println("Employee id:"+emp_id+"\nEmployee name:"+emp_name+"\nBasic salary:"+basic_salary);
		i++;
	}
}

