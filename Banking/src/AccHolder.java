
public class AccHolder {
	private int ac_no;
	private String ac_name;
	private double balance;
	public AccHolder(int ac_no, String ac_name, double balance) {
		super();
		this.ac_no = ac_no;
		this.ac_name = ac_name;
		this.balance = balance;
	}
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance=amt+balance;
	}
	
	public void withdraw(double amt) {
		balance=balance-amt;
	}
	
	public void display() {
		System.out.println(ac_no+"\t"+ac_name+"\t"+balance);
	}
}
