import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
        int n=6;
       
       
     if(n==0||n==1)
        System.out.print("1");
    
     if(n>1)
     {
         
         int c=1;
         while(n>1)
         {
            c = c*n;
            n--;
         }
         
         System.out.print(c );
     }
     
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,610, 987, 1597, 2584, 4181
   
}

import java.util.*;
public class Factorial
{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
if(n<0)
	
