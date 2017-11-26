import java.util.*;
public class vowelOrConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		String vowel="aeiouAEIOU";
		System.out.println(c);
		int len=vowel.length();
		System.out.println(len);
		char ch; int a=00;
		for(int i=0;i<len;i++)
		{
			ch=vowel.charAt(i);
			if(ch==c)
				a=1;			
		}
		if(a==1)
			System.out.println("It is a vowel..!!");
		else
			System.out.println("It is a constant");
	}

}
