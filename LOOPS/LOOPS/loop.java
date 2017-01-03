

	import java.util.Scanner;
	public class loop {
	public int n;
		public void Input()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("1. For LOOP");
			System.out.println("2. While");
			System.out.println("3. Do..While");
			System.out.println("Enter A choice");
			n = s.nextInt();
		}
		public void check()
		{
			switch(n)
			{
			case 1: forloop();
			break;
			case 2: whileloop();
			break;
			case 3: dowhileloop();
			break;
			default: System.out.println("Sorry!! Wrong input.>!!");
			break;
			}
		}
		public void forloop()
		{
			System.out.println("Example of For loop - ");
			System.out.println("Showing all prime numbers from 1 to 100");
			for(int i=1;i<=100;i++)
			{
				if(i%2!=0 && i%3!=0)
					System.out.println(i);
			}
		}
		public void whileloop()
		{
			System.out.println("Program to show the use of While LOOP");
			System.out.println("All even numbers from 1 to 10");
			int i =1;
			while(i<=10)
			{
				if(i%2==0)
					System.out.println(i);
				i++;
			}
		}
		public void dowhileloop()
		{
			int i =1;
			System.out.println("Program to show the use of While LOOP");
			System.out.println("All even numbers from 1 to 10");
			do{
				i++;
				if(i%2==0)
				System.out.println(i);
				}
			while (i <= 10);
		}
		
		public static void main(String[]args)
		{
			loop l= new loop();
			l.Input();
			l.check();
		}
	}
