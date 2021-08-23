import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     String s="neha";
     String n="";
     
     Stack<Character> st = new Stack<>();
     for(int i=0;i<s.length();i++)
        st.push(s.charAt(i));
        
    while(st.size()!=0)
    {
         
        n += st.pop();
        
    }
    
    System.out.println(n);
     
    }
}