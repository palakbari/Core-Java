package in.mindcraft.EmpDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private String City;
	private int PinCode;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPinCode() {
		return PinCode;
	}
	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}
	
}
