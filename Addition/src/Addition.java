import java.util.Scanner;
public class Addition
{
public static void main(String[]args)
{
Scanner s= new Scanner(System.in);
System.out.println("Please Input 1st no. - ");
int fn=s.nextInt();
System.out.println("Please Input 2n no. - ");
int sn=s.nextInt();
int sum=fn+sn;
System.out.println("The sum is - "+sum);
}
}