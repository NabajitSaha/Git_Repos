
package leapyear;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year - ");
        int year=s.nextInt();
        if(year%4==0)
            System.out.println("This is a leap year");
        else
            System.out.println("This is not a leap year");
    }
    
}
