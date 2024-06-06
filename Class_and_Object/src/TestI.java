
public interface TestI {
	int a=45;
	public double area();
}

class Rec implements TestI
{
	double dim1;
	double dim2;
	
	public Rec(double dim1, double dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	public double area()
	{
		return (dim1*dim2*a);
	}
}

class Tri implements TestI
{
	double dim1;
	double dim2;
	
	public Tri(double dim1, double dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	public double area()
	{
		return (dim1*dim2)/2;
	}
}

