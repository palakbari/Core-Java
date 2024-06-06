import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Number are "+a+" and "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("Number are "+a+" and "+b);
	}

}
