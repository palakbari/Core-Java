class Polygon
{
	
}

class Circle extends Polygon
{
	private int radius;
	public Circle()
	{
		radius=1;
	}
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return (3.14*radius*radius);
	}
	public double perimeter()
	{
		return (2*3.14*radius);
	}
}
class Rectangle extends Polygon
{
	private int l,b;
	public Rectangle()
	{
		
	}
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public double area()
	{
		return (l*b);
	}
	public double perimeter()
	{
		return 2*(l*b);
	}
}
class Square extends Rectangle
{
	public Square()
	{
		super(10,20);
	}
	public Square(int s)
	{
		super(s,s);
	}
	public double area()
	{
		return super.area();
	}
	public double perimeter()
	{
		return super.perimeter();
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4);
		System.out.println(c.area());
		
		Rectangle r = new Rectangle(2,3);
		System.out.println(r.area());
		
		Square s = new Square();
		System.out.println(s.area());
	}

}
