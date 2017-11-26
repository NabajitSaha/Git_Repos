import java.util.*;
public class reverse2 {
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no. of strings - ");
		int n=s.nextInt();
		
		String str2[]= new String[n];
		for(int j=0;j<n;j++)
		{
			System.out.print("input - ");
			str2[j]=s.nextLine();
			System.out.println();
		}
		System.out.println("REVERSE STRING ");
		for(int k=(n-1);k>=0;k--)
		{
			System.out.println(str2[k]);
		}
	}

}
