
package exercise.pkg9;
import java.util.Scanner;
class grocery
    {
        double wt=0;
        double addweight(double a,double x){
        wt=a+x;
        return wt;
        }
        double minusweight(double b,double y)
        {
            wt=b-y;
            return wt;
        }
        void display(double t)
        {
            wt=t;
        System.out.println("Total Weight Taken is "+wt+" kgs");
        }
       
        
    }
public class Exercise9 
{
    public static void main(String[] args) {
        
        double wght;
        grocery obj = new grocery();
        Scanner s=new Scanner(System.in);
        System.out.println("Fresh Groceries");
        System.out.println("**WELCOME**");
        System.out.println("Enter Items Taken -                 **In Weights(kgs)");
        double w=s.nextDouble();
        System.out.println("Add/Remove weights...            **Enter + or - to add or remove items.");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        int opp=s.nextInt();
        switch(opp)
        {
            case 1: System.out.println("Enter weight - ");
                       wght=s.nextDouble();
                       System.out.println("Total Weight Taken is "+obj.addweight(w, wght)+" kgs");
                       break;
            case 2: System.out.println("Enter weight - ");
                       wght=s.nextDouble();
                       System.out.println("Total Weight Taken is "+obj.minusweight(w, wght)+" kgs");
                       break;
            default: System.out.println("Invalid Input..!!"); 
                     obj.display(w);
                     break;
        }            
                                            }
}    
    
