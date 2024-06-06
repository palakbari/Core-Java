
public class Variable_Argument {
	public static String add(String s,String ...a)
	{
		String concat = " ";
		for(int i=0;i<a.length;i++)
			concat=concat+a[i];
			return s+concat;
	}
	public static int add1(int ...a)
	{
		int b=0;
		for(int i=0;i<a.length;i++)
			b=b+a[i];
			return b;
	}
	public static float add2(float ...a)
	{
		float b=0f;
		for(int i=0;i<a.length;i++)
			b=b+a[i];
			return b;
	}
	public static double add3(double ...a)
	{
		double b=0;
		for(int i=0;i<a.length;i++)
			b=b+a[i];
			return b;
	}
	public static long add4(long ...a)
	{
		long b=0;
		for(int i=0;i<a.length;i++)
			b=b+a[i];
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add("Concat","a","b","c"));
		System.out.println(add1(10,20,30,40,50));
		System.out.println(add2(10f,20f,30f,40f,50f));
		System.out.println(add3(10,20,30,40,50));
		System.out.println(add4(10,20,30,40,50));
	}

}
