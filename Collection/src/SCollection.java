import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> sh = new HashSet<>();
		sh.add(45);
		sh.add(18);
		sh.add(07);
		sh.add(63);
		sh.add(54);
		System.out.println(sh);
		System.out.println("Random Order");
		System.out.println(sh.hashCode());
		System.out.println(sh.isEmpty());
		System.out.println(sh.size());
		System.out.println(sh.removeAll(sh));
		System.out.println();
		
		Set <Integer> lsh = new LinkedHashSet<>();
		lsh.add(45);
		lsh.add(18);
		lsh.add(07);
		lsh.add(63);
		lsh.add(54);
		System.out.println(lsh);
		System.out.println("Given Order");
		System.out.println(lsh.hashCode());
		System.out.println(lsh.isEmpty());
		System.out.println(lsh.size());
		System.out.println(lsh.removeAll(lsh));
		System.out.println();
		
		Set <Integer> ts = new TreeSet<>();
		ts.add(45);
		ts.add(18);
		ts.add(07);
		ts.add(63);
		ts.add(54);
		System.out.println(ts);
		System.out.println("Sorted Order");
		System.out.println(ts.hashCode());
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.removeAll(ts));
	}

}
