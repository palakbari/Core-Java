package Hierarchy;

public class Test {
	
	public static void printobj(Employee e)
	{
		e.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(45, "ABC", 1000);
		//m.display();
		
		printobj(m);
		System.out.println("Manager salary:"+m.calSalaryManager());

		MarketingExecutive me = new MarketingExecutive(18, "XYZ", 1000, 5, 200);
		System.out.println("Marketing Executive salary:"+me.calsalaryexe());
	}

}
