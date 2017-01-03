/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

/**
 *
 * @author n4b4j
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name - ");
        String n=s.nextLine();
        System.out.println("Enter birth day - ");
        int date= s.nextInt();
        System.out.println("Enter Birth Month in no. - ");
        int month=s.nextInt();
        System.out.println("Enter Birth Year - ");
        int year=s.nextInt();
        LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(year,month,date);
Period p = Period.between(birthday, today);
System.out.println("....................................");
System.out.println("Hi!"+n);
System.out.println("Your age is - ");
System.out.println(p.getYears()+ " Years ,"+p.getMonths()+" Months ,"+p.getDays()+" Days");
    }
    
}
