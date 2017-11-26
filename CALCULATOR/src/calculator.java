import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a = s.nextInt();
		System.out.println("Enter 2nd no.");
		int b = s.nextInt();
		System.out.println("Enter Function - ");
		char ch=s.next().charAt(0);
		int result=0;
		switch(ch)
		{
		
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
			default:
				System.out.println("Wrong Input..!!!");
		}
		
		System.out.println("Result = "+result);
	}
}
