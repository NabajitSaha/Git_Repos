
public class ArrayLength {

	public static void main(String[] args) {
		// Taking two different arrays
		int a[] = new int[] {1,3,4,5,6,7,8,9,2};
		int b[]= new int[] {5,4,3,2,1};
		int len1=a.length;
		int len2=b.length;
		if(len1>len2)
		{
			System.out.println("THE 1st ARRAY's length is larger than then 2nd..!!");
			System.out.println(len1);
			System.out.println("Displaying 1st ARRAY - ");
			for(int i =0;i<len1;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("The 2nd ARRAY's lenght is larger than the 1st..!!!");
			System.out.println("Displaying 2nd ARRAY");
			for(int i=0;i<len2;i++)
			{
				System.out.println(b[i]);
			}
		}

	}

}
