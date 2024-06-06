package in.mindcraft.LaptopDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private String name;
	private int roll_no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	@OneToMany
	private List <Laptop> otm = new ArrayList <Laptop> ();

	public List<Laptop> getList1() {
		return otm;
	}
	public void setList1(List<Laptop> list) {
		this.otm = list;
	}

}
