import java.util.*;
public class Directions
{
	public static void main(String[]args)
	{
		int check=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Directions - ");
	String d= s.nextLine();
	
	if(d.equals("NORTH")||d.equals("SOUTH")||d.equals("WEST")||d.equals("EAST")||d.equals("NORTHEAST")||d.equals("NORTHWEST")||d.equals("SOUTHEAST")||d.equals("SOUTHWEST"));
	{
	System.out.println("The entered direction is = "+d);
	check =1;
	}
	if(check!=1)
		System.out.println("Wrong Input..!!");
}
}