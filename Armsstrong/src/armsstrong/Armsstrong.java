package armsstrong;
public class Armsstrong {
    public static void main(String[] args) {
        System.out.println("The Armsstrong numbers from 100 to 999 are = ");
        int x,y,z;
        int m;//for extrating the digits
        for(int i=100;i<=999;i++)
        {
            y=0;//intialising the value to 0 for summing later
            z=i; // cloning
        while(z>0)
        {
        m=z%10;
        x=(m*m*m);
        y += x;
        z /= 10;
        }
        if(i==y)
        {
            System.out.println(y);
        }
        }
        }
    
}
