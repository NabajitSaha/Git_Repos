
package factory;

import com.phone.*;
//import com.phone.Operatinfactory;


public class Factory {

    
    public static void main(String[] args) {
      Operatinfactory f=new Operatinfactory();
      OS obj=f.getInstance("open");
      obj.spec();
      
     // Android obj=new Android();
     // obj.spec();
     
      
    }
    
}
