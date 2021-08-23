import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
     int n= -123456;
     int r=0;
     
     while(n!=0)
     {
         r = r*10;
         r += n%10;
         n = n/10;
         
         
     }
     
     System.out.print(r);
     
     
     
    
   
     
    }
}