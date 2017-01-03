
package si;

import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        // TODO code application logic here
        double p,r,t;
        double si;
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Choose from the following options");
        System.out.println("1. Simple Interest");
        System.out.println("2. Rate of Interest");
        System.out.println("3. Time ");
        System.out.println("4. Principal");
        System.out.println("Enter Your Choice -");
        int a=s.nextInt();
            if(a==1)
            {
             System.out.println("Enter Principal - ");
             p=s.nextDouble();
             System.out.println("Enter Time - ");
             t=s.nextDouble();
             System.out.println("Enter Rate Of Interest - ");
             r=s.nextDouble();
             si=(p*r*t)/100;
             System.out.println("The S.I is - "+ si);   
            }
            else if(a==2)
                    {
                        System.out.println("Enter Simple Interest - ");
                        si=s.nextDouble();
                        System.out.println("Enter Time - ");
                        t=s.nextDouble();
                        System.out.println("Enter Principal - ");
                        p=s.nextDouble();
                        r=(si*100)/(p*t);
                        System.out.println("The Rate of interest is - "+ r+"%");
                    }
            else if(a==3) {
                System.out.println("Enter Principal - ");
                p=s.nextDouble();
                System.out.println("Enter Rate Of Interest - ");
                r=s.nextDouble();
                System.out.println("Enter Simple Interest");
                si=s.nextDouble();
                t=(si*100)/(r*p);
                System.out.println("The Time period is - "+t+" Years");
            }
            else if(a==4)
            {
                System.out.println("Enter Simple Interest - ");
                si=s.nextDouble();
                System.out.println("Enter Time period - ");
                t=s.nextDouble();
                System.out.println("Enter Rate of Interest - ");
                r=s.nextDouble();
                p=(si*100)/(t*r);
                System.out.println("The Principal is - "+p);
            }
            else if(a>4||a<1)
            {
                System.out.println("Please Enter A Valid Input..!!");
                System.out.println("Try again..!!");
            }
        
    }    
}
