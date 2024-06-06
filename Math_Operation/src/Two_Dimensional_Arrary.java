import java.util.Scanner;
public class Two_Dimensional_Arrary {
	public static void main(String []args)
	{
	int [][]a= new int[3][3];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers:");
	for (int i=0;i<a.length;i++)
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}	
	
		for (int []val:a)
		{
			for(int val1:val) {
				System.out.print(val1+" ");
			}
			System.out.println();
		}

		
	}

}
