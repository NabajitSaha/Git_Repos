package overwritting;
class name{
    String name = "Nabajit";
    void dis()
    {
        System.out.println("The Name is  - "+name);
    }
}
class age extends name
{
   String name = "jack";
    void dis()
    {
        System.out.println("The Name is  - "+name);
    }
        void kk()
        {
            super.dis();
            dis();
        }
        
}
public class Overwritting {
    public static void main(String[] args) {
        age a= new age();
        a.kk();
    }
    
}
