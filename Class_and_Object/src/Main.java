class A
{
	public interface Nested 
	{
		boolean isNotNegative(int a);
	}
}

class B implements A.Nested
{
	public boolean isNotNegative(int a)
	{
		return a<0?false:true;
	}
}
 class Main
 {
	 public static void main (String args[])
	 {
		 A.Nested an = new B();
		 System.out.println(an.isNotNegative(10));
	 }
 }
