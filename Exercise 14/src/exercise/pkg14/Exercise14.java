package exercise.pkg14;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("**Program to Print The Multiplication Table Of Any No.**");
        System.out.println("Enter No. - ");
        int i=s.nextInt();
        System.out.println("Enter The Limit Of The Multiplication Table - ");
        int j=s.nextInt();
        System.out.println("The Multiplication Table Of "+i+" Till "+j+" Is Shown Below...");
        int a,x;
        for(x=1;x<=j;x++)
        {
            a=x*i;
            System.out.println(i+"x"+x+"="+a);
        }
       
    }
    
}
