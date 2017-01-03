package exercise.pkg15;
import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {
                Scanner s= new Scanner(System.in);
                Scanner l= new Scanner(System.in);
                Scanner j=new Scanner(System.in);
                Scanner k= new Scanner(System.in);
                System.out.println("** Employee Records **");
                System.out.println("Enter The No. Of Employees - ");
                int n=s.nextInt();
                int u,t,x,y,z; int w; int c;  
                u=n; t=n; x=n; y=n; z=n; c=n; w=n;  
                long id[]= new long[n];
                String name[]= new String[u];
                String department[]= new String[t];
                String designation[]= new String[x];
                String DOB[]= new String[y];
                char Maristats[]= new char[z];
                for(int a=0;a<w;a++)
                {
                    System.out.println("Enter Employee ID - ");
                    id[a]=s.nextLong();
                    System.out.println("Enter Name - ");
                    name[a]=l.nextLine();
                    System.out.println("Enter Department - ");
                    department[a]=l.nextLine();
                    System.out.println("Enter Designation - ");
                    designation[a]=j.nextLine();
                    System.out.println("Enter Date Of Birth -                 **Day/Month/Year");
                    DOB[a]=j.nextLine();
                    System.out.println("Enter Maritial Status -            **Y/N");
                    Maristats[a]=k.next().charAt(0);
                    System.out.println("--------------------------------------");
                }
                System.out.println("**********************************************");
                System.out.println("The Details Of The Employees Are As Follows - ");
                for(int b=0;b<c;b++)
                {
                    System.out.println("Employee ID - "+id[b]);
                    System.out.println("Name - "+name[b]);
                    System.out.println("Department - "+department[b]);
                    System.out.println("Designation - "+designation[b]);
                    System.out.println("Date Of Birth - "+DOB[b]);
                    System.out.println("marritial Status - "+Maristats[b]);
                    System.out.println("#########################");
                }
                }
                
    }
   
