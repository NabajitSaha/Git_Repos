
package excercise1;
import java.util.Scanner;
class distance{
                    double u,t,a,d;
                    public double dis(double u,double t, double a)
                    {
                        
                        this.u=u;
                        this.t=t;
                        this.a=a;
                        d=(u*t)+((a*t)*(a*t))/2;
                        return d;
                    }
                    
                    
                }
public class Excercise1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        distance obj=new distance();
        System.out.println("Enter Time -");
        double y=s.nextDouble();
        System.out.println("Enter Accelaration -");
        double x=s.nextDouble();
        System.out.println("Enter Initial Speed -");
        double z=s.nextDouble();
        System.out.println("The Distance Traveled is - "+obj.dis(x,y,z));
   
    }
    
}
