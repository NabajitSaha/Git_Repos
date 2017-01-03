
package com.phone;


public class Operatinfactory 
{

   public OS getInstance(String str)
   {
      if(str.equals("open"))
      return new Android();
      else if(str.equals("close"))
          return new Ios();
      else
          return new Windows();
   }
    
}
