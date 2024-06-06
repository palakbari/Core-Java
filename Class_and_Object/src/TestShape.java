abstract class Shape
{
	String color;
	
	public Shape(String color)
	{
		this.color=color;
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();
	
	public String getColor()
	{
		return color;
	}
}

class Circle1 extends Shape
{
	double radius;
	
	public Circle1(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	
	double getArea()
	{
		return 3.14 * radius * radius ;
	}
	
	double getPerimeter()
	{
		return 2 * 3.14 * radius;
	}
}
public class TestShape {
	public static void main(String[] args)
	{
		Shape c = new Circle1("Black",5.5);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getColor());
	}
}
