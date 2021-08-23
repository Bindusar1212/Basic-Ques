import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
    String s="abcbba";
    
    int i=0;
    int j=s.length()-1;
    
    
    
    while(i<=j)
    {
        if(s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        else
            break;
            
    }
     
     
     
    if(i>j)
        System.out.println("YES");
    else
        System.out.println("NO");

     
     
     
    
   
     
    }
}