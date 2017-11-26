import java.util.*;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length of Array");
		int n = s.nextInt();		//getting length
		int arr[]= new int[n];
		for(int i =0;i<n;i++)
		{
		System.out.println("Enter number - ");
		arr[i]=s.nextInt();			//entering array
		}
		int cpy[] = new int[n];
		for(int j=0;j<n;j++)
		{
			cpy[j]=arr[j];	//copying
		}
		System.out.println("The copied arra is = ");
		for(int k=0;k<n;k++)
		{
			System.out.println(cpy[k]);   // displaying copied array
		}
						}	

}
