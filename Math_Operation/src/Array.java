
public class Array 
{	public static void main(String args[])
	{
	int[] a= {2,5,1,3,7};
	int[] b=new int[5];
	int max=0;
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max)
		max=a[i];
	}
	System.out.println("Maximum number"+max);
	System.out.println(min);
	for(int i=0;i<a.length;i++) {
		if(a[i]<min)
		min=a[i];
	}
	System.out.println("Minimum number"+min);
	for(int i=0;i<a.length;i++) {
		b[i]=a[i]*5;
	}
	for(int v:b)
	{
		System.out.println(v);
	}
	}
}
