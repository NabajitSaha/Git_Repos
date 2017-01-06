import java.util.*;
interface Array  //creating an interface
{
	public void Input(int n);		// method for taking in input from the user
}

abstract class ARR // creating the concept of abstract class
{
	public void displaySUMandAVG() // creating method for displaying the sum and average
	{}
}

class ArrayIN extends ARR implements Array 
{ // implementing the interface and extending the abstract class 
	public float avg=0; 
	public float sum=0;
	
	public void Input(int n) // taking in input from user using loop
	{	
		int a[]= new int[n];
		Scanner s1= new Scanner(System.in);
		for(int i=0;i<(a.length);i++)
		{	
			System.out.println("Enter Number - ");
			a[i]=s1.nextInt();
			sum=sum+a[i]; //calculating the sum of the array
		}
		avg=sum/(a.length); //calculating the average of the array
	}
		public void displaySUMandAVG()  //displaying the sum and average of the array elements
	{
		System.out.println("The Sum Of The Array Is = "+sum);
		System.out.println("The Average of The Array Entered is = "+avg);
	}
}
public class ArrayAverage // main class
{	
	public static void main(String[]args) //main method
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The No. Of Inputs To Be Taken - ");
		int no = s.nextInt(); // taking in the no. of count of the array
		ArrayIN obj= new ArrayIN(); // setting the count of the array by the constructor
		obj.Input(no);
		obj.displaySUMandAVG();
	}

}
