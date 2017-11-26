
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FIBONACCI SERIES..!!");
		int a=0; int b=1; int sum=0;
			
		for(int i=0;i<20;i++)
			{
					if(sum<200)
					{
					System.out.println(sum+" ");
					}
					sum=a+b;
					a=b;
					b=sum;
			}
		
			
	}

}
