import java.util.ArrayList;

public class ALCollection {
	public static void main(String args[])
	{
		ArrayList <String> al = new ArrayList<String>();
		System.out.println(al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al.size());
		System.out.println(al.clone());
		System.out.println(al.contains("B"));
		System.out.println(al.hashCode());
		System.out.println(al.indexOf("C"));
		System.out.println(al.lastIndexOf(al));
		al.add("E");
		System.out.println(al);
		System.out.println(al.remove("E"));
	}
}
