package weight;

import java.util.*;
class Selection{
	double[]weight;
	private Scanner kb;
	public void input(){
		weight=new double[10];
		kb = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter Weight:" +(i+1));
			weight[i] = kb.nextDouble();
		}
	}
	public void selectionSort(){
		int i,j,maxIndex; double tmp;
		int n=weight.length;
		for(i=0;i<n-1;i++)
		{
			maxIndex=i;
			for(j=i+1;j<n;j++)
			{
				if(weight[j]>weight[maxIndex])
					maxIndex=i;
				if(maxIndex !=i)
				{
				tmp=weight[i];
				weight[i]=weight[maxIndex];
				weight[maxIndex]=tmp;
				}
			}
		}
	}
		public void display()
		{
		int n=weight.length;
		System.out.println("The weight in Ascending order is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(weight[i]+"");
		}
		}
	
	
	public static void main(String[]args)
	{
		Selection sel=new Selection();
		sel.input();
		sel.selectionSort();
		sel.display();
	}
}
