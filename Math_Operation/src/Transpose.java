
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = {{9,8,7},{1,2,3},{6,5,4}};
		int [][]b = new int[3][3];		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println("Original Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transposed Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
