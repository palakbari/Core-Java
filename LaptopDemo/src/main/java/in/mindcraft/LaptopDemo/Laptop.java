package in.mindcraft.LaptopDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int id;
	private String name;
	private int cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@ManyToOne
	private List <Student> mto = new ArrayList <Student> ();
	
	public List <Student> getList() {
		return mto;
	}
	public void setList(List<Student> list) {
		this.mto = list;
	}

	@ManyToMany
	private List <Student> mtm = new ArrayList <Student> ();

	public List <Student> getList3() {
		return mtm;
	}
	public void setList3(List<Student> list) {
		this.mtm = list;
	}
	
}
