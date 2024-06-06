
public class Math1 {
	
	public int area(int l,int b)
	{
		return (l*b);
	}
	public int area(int l)
	{
		return (l*l);
	}
	public double area(double r)
	{
		return (3.14*r*r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m1 = new Math1();
		System.out.println("Area of rectangle:"+m1.area(2,4));
		System.out.println("Area of square:"+m1.area(2));
		System.out.println("Area of circle:"+m1.area(2.5));
	}

}
