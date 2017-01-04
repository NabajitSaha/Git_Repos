import java.util.Scanner;

class employee
{
	String name,city,depart;
	int age;
public employee()
{
}
public void employee(String name,int age, String city, String depart)
{
	this.name=name;
	this.age=age;
	this.city=city;
	this.depart=depart;
}
public void dis()
{
System.out.println("Name - "+name);
System.out.println("Age - "+age);
System.out.println("Department - "+depart);
System.out.println("City - "+city);
}	
}	
class EData extends employee
{
	employee x= new employee();
	Scanner s= new Scanner(System.in);
	Scanner s2= new Scanner(System.in);
	public void input()
	{
		String ename,edepart,ecity;
		int eage;		
	System.out.println("Enter Name - ");
	ename=s.next();
	System.out.println("Enter Age - ");
	eage=s.nextInt();
	System.out.println("Enter Department - ");
	edepart=s.next();
	System.out.println("Enter City - ");
	ecity = s2.next();
	x.employee(ename, eage,edepart,ecity);
	}
	public void display()
	{
		x.dis();
	}
}
public class C_Employee
{
public static void main(String[]args)
{
	EData ed= new EData();
	ed.input();
	ed.display();
}
}
