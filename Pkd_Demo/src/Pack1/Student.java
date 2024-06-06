package Pack1;

public class Student {
	int roll_no;
	String name;
	public Student(int r,String n)
	{
		roll_no=r;
		name=n;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll_no);
	}
}
