
public class Student {
	int Roll_no;
	String Name;
	public Student() {
		super();
	}
	public Student(int roll_no, String name) {
		super();
		Roll_no = roll_no;
		Name = name;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public void setRoll_no(int roll_no) {
		System.out.println("Student roll number:"+roll_no);
		Roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		System.out.println("Student name:"+name);
		Name = name;
	}
	
	
}
