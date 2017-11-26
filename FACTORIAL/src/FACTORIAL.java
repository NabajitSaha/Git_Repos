import java.util.*;
public class FACTORIAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a no. - ");
		int n=s.nextInt();
		int m=1;
		for(int i=1;i<=n;i++)
		{
			m=m*i;
		}
		System.out.println("The factorial of "+n+" is = "+m);
	}

}
