import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Laptop
{
	private int id;
	private String name;
	private double cost;
	private static int count;
	
	public Laptop()
	{
		id = 45;
		name = "Rohit";
		cost = 45000;
	}

	public Laptop(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public void show()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\nCost:"+cost);
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(name, other.name);
	}	
}

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Laptop> lap = new HashSet <>();
		Laptop l = new Laptop();
		System.out.println(lap.hashCode());
		System.out.println(lap.add(new Laptop(18, "Virat", 18000)));
		System.out.println(lap.hashCode());
		Iterator <Laptop> itr = lap.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
	}

}
