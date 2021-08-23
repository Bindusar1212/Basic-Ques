public class MyClass {
    public static void main(String args[]) {
     int a=625;
     int b=125;
     int hcf=0;
     
     for(int i=1;i<=a||i<=b;i++)
     {
         if(a%i==0 && b%i==0)
            hcf = i;
     }
     
     System.out.println(hcf);
    }
}