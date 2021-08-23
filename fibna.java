import java.util.*;

public class MyClass {
    public static void main(String args[]) {
     
        int n=20;
       
       
        if(n>=0)
            System.out.print("0"+" ");
        if(n>=1)
            System.out.print("1"+" ");
        if(n>=2){
            
                int a=0;
                int b=1;
                
                
                for(int i=2;i<n;i++)
                {
                    int c=a+b;
                    a=b;
                    b=c;
                    
                    System.out.print(c + " " );
                }
        }
     
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,610, 987, 1597, 2584, 4181
   
}

import java.util.*;

public class fib{
public static void main(String[] args)
{
	int n,a=0,b=0,c=1;
	Scanner s =new Scanner(System.in);
	System.out.print("enter the value");
	n=s.nextInt();
	System.out.println("fibonacci series");
	for(int i=0;i<=n;i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.print(a + " ");
		
	
