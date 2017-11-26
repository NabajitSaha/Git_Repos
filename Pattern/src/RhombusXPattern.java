
public class RhombusXPattern {
public static void main(String[]a)
{
	System.out.println("Showing pattern");
	for(int i=1;i<=7;i++)
	{
		if(i%2!=0)
		{
		for(int j=1;j<=i*2-1 ;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
}
