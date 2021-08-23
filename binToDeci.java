public class MyClass {
    public static void main(String args[]) {
        int bin= 1101;
        int deci=0;
        int n=0;
        
        
        while(true)
        {
            if(bin==0)
                break;
            else
            {
                int temp = bin%10;
                deci += temp*Math.pow(2,n);
                bin = bin/10;
                n++;
                
            }
        }
        
        System.out.println(deci);
        
    }
}