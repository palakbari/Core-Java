import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number:");
		a=sc.nextInt();
		int n=0,p = 0,t=0;
		n=a;
		while(n != 0)
		{
			n = n%10;
			t = t+p*p*p;
			n = n/10;
		}
		if(n==a)
		System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");

	}

}
