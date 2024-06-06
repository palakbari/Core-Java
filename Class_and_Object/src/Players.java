interface printTablable
{
	public void printDetails();
}

class CktPlayers implements printTablable
{
	String name="Rohit Sharma";
	int runs=264;
	
	void Details()
	{
		System.out.println("Name:"+name+"\nRuns:"+runs);
	}
	
	public void printDetails()
	{
		System.out.println("Cricket Player");
	}
}

class HkyPlayers implements printTablable
{
	String name="Harmanpreet Singh";
	int goals=125;
	
	void Details()
	{
		System.out.println("Name:"+name+"\nGoals:"+goals);
	}
	
	public void printDetails()
	{
		System.out.println("Hockey Player");
	}
}
public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CktPlayers cp = new CktPlayers();
		cp.Details();
		cp.printDetails();
		
		HkyPlayers hp = new HkyPlayers();
		hp.Details();
		hp.printDetails();
	}

}
