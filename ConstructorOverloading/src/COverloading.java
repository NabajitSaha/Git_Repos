import java.util.Scanner;

class furniture
{
public furniture()
{
	System.out.println("######################");
	}
public furniture(String n,int l, int b)
{
	System.out.println("The Details Entered Are As Follows - ");
	System.out.println();
System.out.println("Type - "+n);	
System.out.println("Length - "+l);
System.out.println("Breadth -"+b);
}
public furniture(String n,int l, int b, int h)
{
	System.out.println("The Details Entered Are As Follows - ");
	System.out.println();
	System.out.println("Type - "+n);
	System.out.println("Length - "+l);
	System.out.println("Breadth - "+b);
	System.out.println("Height - "+h);
}
}
public class COverloading extends furniture
{
	public static void main(String[]args)
	{
		String name;
		int length,height,breadth;
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome to The Furniture Shop");
		furniture f= new furniture();
		System.out.println("Enter The type of the furniture");
		name=s.next();
		System.out.println("Enter The length - ");
		length=s.nextInt();
		System.out.println("Enter Breadth - ");
		breadth = s.nextInt();
		System.out.println("Enter Height - ");
		height = s.nextInt();
		furniture f1 = new furniture();
		if(height == 0)
		{
		furniture f2 = new furniture(name,length,breadth);
		}
		else
		{
		furniture f3 = new furniture(name,length, breadth, height);
		}
	}
}
