package c4ex2;
import java.util.*;
class input
{
    String first,last;
    int age;
    String course;
    int sid;
    int salary,eid;
    String depart,desig;
    Scanner x=new Scanner(System.in);
    Scanner y=new Scanner(System.in);
void nameage()
{
    System.out.println("Enter 1st name - ");
    first=x.nextLine();
    System.out.println();
    System.out.println("Enter Last name - ");
    last=x.nextLine();
    System.out.println();
    System.out.println("Enter Age - ");
    age=x.nextInt();
    System.out.println();
}
void student()
{
    System.out.println("Enter Course Enrolled - ");
    course=x.nextLine();
    System.out.println();
    System.out.println("Student ID - ");
    sid=x.nextInt();
    System.out.println("-------------------------------------");
    System.out.println();
}
void employee()
{
    System.out.println("Enter Employee ID - ");
    eid=y.nextInt();
    System.out.println();
    System.out.println("Enter Department - ");
    depart=y.nextLine();
    System.out.println();
    System.out.println("Enter Designation - ");
    desig=y.nextLine();
    System.out.println("--------------------------------------");
    System.out.println();
}
void edisplay()
{
    System.out.println("Employee Details - ");
    System.out.println();
    System.out.println("First Name - "+first);
    System.out.println("Last Name - "+last);
    System.out.println("Age - "+age);
    System.out.println("Employee ID - "+eid);
    System.out.println("Department - "+depart);
    System.out.println("Designation - "+desig);
}
void sdisplay()
{
    System.out.println("Student Details - ");
    System.out.println();
    System.out.println("First Name - "+first);
    System.out.println("Last Name - "+last);
    System.out.println("Age - "+age);
    System.out.println("Course Enrolled - "+course);
    System.out.println("Student ID - "+sid);
}
}
public class C4Ex2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        input obj=new input();
        int z=0;
        System.out.println("Which Stream Are You?");
        System.out.println("Employee/Student");
        String choice=s.nextLine();
        if("Employee".equals(choice)|| "employee".equals(choice))
        {
            z=1;
        obj.nameage();
        obj.employee();
        obj.edisplay();
        }
        else if("Student".equals(choice) || "student".equals(choice))
        {
            z=1;
        obj.nameage();
        obj.student();
        obj.sdisplay();
        }
        else if(z==0)
        {
            System.out.println("Wrong Input...!!!");
        }
    }
    
}
