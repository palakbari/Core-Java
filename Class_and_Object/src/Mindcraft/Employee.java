package Mindcraft;

public class Employee {
	private int emp_id;
	private String emp_name;
	private Date dob;
	
	public Employee() {
		emp_id=45;
		emp_name="ABC";
		dob=new Date();
	}

	public Employee(int empid, String empname,int d,int m,int y) {
		emp_id = empid;
		emp_name = empname;
		dob=new Date(d, m, y);
	}
	
	public void show()
	{
		System.out.println("Employee id:"+emp_id+"\nEmployee name:"+emp_name);
		dob.show();
	}
	
}
