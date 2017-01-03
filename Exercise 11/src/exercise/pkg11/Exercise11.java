package exercise.pkg11;
import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        System.out.println("Enter character for checking - ");
        char ch=s.next().charAt(0);
        System.out.println("The character entered by you is - "+ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println("The Character Entered Is A Vowel");
        else
            System.out.println("The Character Entered Is A Consonant");
    }
    
}
