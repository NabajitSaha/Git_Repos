import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String length- ");
		int n=s.nextInt();
		int n2=n;
		String str[]= new String[n];
		System.out.println("Enter value = ");
		for(int i =0;i<n;)  // 0 1 2
		{			
			str[i]=s.nextLine();
			i++;
		}
		System.out.println("Displaying String Array in Reverse Order ");
		for(int j=(n2-1);j>=0;j--)
		{
			System.out.println(str[j]);
		}
		
	}

}
