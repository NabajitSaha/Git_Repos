package charorno;
import java.util.*;
public class CharOrNo {

    public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter a charcater - ");
            char c=s.next().charAt(0);
            System.out.println("The Character entered is - "+c);
            String no="0123456789";
            String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String alphas="abcdefghijklmnopqrstuvwxyz";
            char chs;
            char ch2;
            int len2= alpha.length();
            int len= no.length(); 
            char ch; int x=0;
            for(int i=0;i<=9;i++)
            {
                    ch=no.charAt(i);
                    if(ch==c){
                                  x=1;        }
            }
            for(int j=0;j<len2;j++)
            {
            ch2=alpha.charAt(j);
            if(ch2==c)
                x=2;
            }
            for(int k=0;k<len2;k++)
            {
                chs=alphas.charAt(k);
                if(chs==c)
                    x=3;
            }
            switch(x)
            {
                case 1:System.out.println("It is a number");
                        break;
                case 2:System.out.println("It is an alphabet");
                        break;
                case 3:System.out.println("It is an alphabet");
                        break;
                default: System.out.println("Wrong Input..!! The character is a symbol");        
            }
}
}
                  
                      
