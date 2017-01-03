package addstring;
import java.util.Scanner;
public class AddString {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter First Word - ");
    String a=s.nextLine();
    System.out.println("Enter 2nd word - ");
    String b=s.nextLine();
    String c=a+b;
    System.out.println("The Combined Word is "+c);
    }
    
}
