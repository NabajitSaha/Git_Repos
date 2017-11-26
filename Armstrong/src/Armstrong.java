import java.util.*;
public class Armstrong {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter a no. - ");
		int n=s.nextInt();
		int temp =n; int count=0;
		int i=0;
		while(n>0)
		{
			 i=n%10;
			count++;    // finding no. of digits
			n=n/10;
		}
		int m; int temp2 = temp; double sum=0;
		while(temp>0)
		{
			m=temp%10;
			temp=temp/10;
			sum=sum+Math.pow(m,count);
		}
		if(temp2==sum)
		System.out.println("Armsstring no.");
		else
			System.out.println("Not Armsstrong no.");
	}

}
