import java.util.*;
public class PrimaryNumber 
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number - ");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("This is a prime no. ");
		else
			System.out.println("This is not a prime no.");
	}
}
