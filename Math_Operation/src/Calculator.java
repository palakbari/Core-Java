import java.util.Scanner;

class abc{
	int a=10,b=5;
	int add()
	{
		return a+b;
	}
	int subtract()
	{
		return a-b;
	}
	
	void add1() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition:"+(a+b));
		
	}
	void string()
	{
		String a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		a=sc.next();
		b=sc.next();
		System.out.println("String:"+a+" "+b);
	}
	void multiply(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Multiplication:"+(a*b));
	}
}

class Calculator 
{
	public static void main(String args[]) {
		abc c=new abc();
		//System.out.println(c.add());
		//System.out.println(c.subtract());
		c.add1();
		c.string();
		c.multiply(2,4);	
	}
}
