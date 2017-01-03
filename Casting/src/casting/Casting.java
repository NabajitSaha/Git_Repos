package casting;
import java.util.*;
public class Casting {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter A No. or A Charcter - ");
        char ch=s.next().charAt(0);
        int c=(int)ch;
        System.out.println("The character in integer is - "+c);
        long l=(long)ch;
        System.out.println("The character in long is - "+l);
        double d=(double)ch;
        System.out.println("The character in double is - "+d);
        float f=(float)ch;
        System.out.println("The character in float is - "+f);
        
    }
    
}