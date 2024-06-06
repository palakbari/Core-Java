package in.mindcraft.EmpDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String Name;
	
	
//	//do not set entity and id in ADDRESS table 
//	//generate getter and setter method also
//	//add one to one relation in both the tables
//	//both tables will have an extra joining table
//	@OneToOne
//	@JoinColumn(name="ad_id")
//	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@OneToMany
	private List<Address> list=new ArrayList<Address>();

	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	
}
