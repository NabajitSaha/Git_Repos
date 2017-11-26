import java.util.Scanner;

public class Pattern
{
	private static Scanner s;

	public static void main(String[]args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter Limit - ");
		int n=s.nextInt();
		for(int j=1;j<=n;j++) //1 2 3
		{
		for(int k=1;k<=j;k++) // 1 12 123 
		{
			System.out.print(k+" ");
		}
		System.out.println();
	
		}
	}
}
