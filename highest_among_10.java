import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
        int arr[] = {};
        int n = arr.length;
        if(n!=0){
            int grt=arr[0];
        
        
        
            for(int i=0;i<n;i++)
            {
                if(arr[i]>grt)
                    grt=arr[i];
                
            }
          System.out.println(grt); 
        }
        else
            System.out.println("Size is Zero"); 
    
        
     
    }
}