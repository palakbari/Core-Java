package in.mindcraft.MenuDriven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilePhone {

	@Id
	private int id;
	private String name;
	private double price;
	
	public MobilePhone() {
		super();
	}

	public MobilePhone(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
