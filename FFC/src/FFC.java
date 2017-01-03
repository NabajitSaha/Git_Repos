import java.util.Scanner;

abstract class furniture
{
double length,width,price;
public void dis(double l,double w, double p)
{
this.length=l;
this.width=w;
this.price=p;
System.out.println("Lenght = "+length);
System.out.println("Width = "+width);
System.out.println("Price = "+price);
}
}
public class FFC extends furniture
{
	public int n;
	public void input()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Welcome to Furnture and Fitings Company (FFC) ");
		System.out.println("Please Select From The Following Furnitures To Get Details");
		System.out.println("1. Chair");
		System.out.println("2. Table");
		System.out.println("3. BookShelves");
		System.out.println("Enter Your Choice - ");
		n = x.nextInt();
	}
	public void display()
	{
		switch(n)
		{
		case 1: dis(10,5,250);
		break;
		case 2: dis(15,7,350);
		break;
		case 3: dis(20,15,500);
				int s =13;
				System.out.println("The No Of Shelves are = "+s);
		break;
		default:
			System.out.println("Wrong Input..!! Try Again..!!");
		}
	}
	public static void main(String[] args) 
	{
		FFC f = new FFC();
		f.input();
		f.display();
	}
}
