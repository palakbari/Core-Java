package Mindcraft;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.show();
		
		WageEmployee we = new WageEmployee();
		we.show();
		we.calsalary();
		
		SalesPerson sp = new SalesPerson();
		sp.show();
		sp.calsalary();
	}

}
