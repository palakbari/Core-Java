import java.util.Iterator;
import java.util.Vector;

public class VCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector<>();
		v.add(45);
		v.add(18);
		v.add(07);
		v.add(63);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.clone());
		System.out.println(v.contains(33));
		System.out.println(v.indexOf(45));
		System.out.println(v.isEmpty());
		System.out.println(v.lastIndexOf(v));
		v.add(33);
		System.out.println(v.size());
		System.out.println(v.removeElement(33));
		System.out.println(v.hashCode());
		v.insertElementAt(8, 3);
		System.out.println(v);
		System.out.println(v.toString());
		Iterator <Integer> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		System.out.println(v.removeAll(v));

	}

}
