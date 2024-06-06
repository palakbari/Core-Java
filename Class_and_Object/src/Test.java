abstract class Figure
{
	double dim1;
	double dim2;
	
	Figure(double a, double b) 
	{
		dim1 = a;
		dim2 = b;
	}
	
	abstract double area();
	
	void showarea()
	{
		System.out.println("Hi show area");
	}
}
	
class rectangle1 extends Figure
	{
		public rectangle1(double a, double b)
		{
			super(a,b);
		}
		
		double area()
		{
			System.out.println("Area of rectangle:");
			return (dim1*dim2);
		}
	}

	
class Triangle extends Figure
{
	Triangle(double a, double b)
	{
		super(a,b);
	}
	
	double area()
	{
		System.out.println("Area of Triangle:");
		return (dim1*dim2)/2;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle1 r = new rectangle1(45.4,18.5);
		Triangle t = new Triangle(45.2,18.1);
		r.showarea();
		System.out.println(r.area());
		System.out.println(t.area());
	}

}
