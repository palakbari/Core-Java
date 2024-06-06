
public class Teacher {
	int teacher_id;
	String teacher_name;
	String class_assigned;
	public Teacher() {
		super();
	}
	public Teacher(int teacher_id, String teacher_name, String class_assigned) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.class_assigned = class_assigned;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		System.out.println("Teacher id:"+teacher_id);
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		System.out.println("Teacher name:"+teacher_name);
		this.teacher_name = teacher_name;
	}
	public String getClass_assigned() {
		return class_assigned;
	}
	public void setClass_assigned(String class_assigned) {
		System.out.println("Teacher class assigned:"+teacher_name);
		this.class_assigned = class_assigned;
	}
	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", class_assigned="
				+ class_assigned + "]";
	}
	
}
