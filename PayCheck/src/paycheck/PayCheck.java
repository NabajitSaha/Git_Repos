package paycheck;
import java.util.Scanner;
public class PayCheck
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Your name - ");
String n= s.nextLine();
System.out.println("Enter No. Of Days Worked - ");
int d=s.nextInt();
System.out.println("Enter Salary per day - ");
int salary= s.nextInt();
int totalsalary = d*salary;
System.out.println("Name - "+n);
System.out.println("No. of days worked - "+ d);
System.out.println("Your total salary is - "+ totalsalary);
        
}
}