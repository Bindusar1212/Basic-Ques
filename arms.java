public class MyClass {
    public static void main(String args[]) {
        int bin= 2;
        int s=bin;
        
        int cnt=0;
        int sum=0;
        
        while(bin>0)
        {
          
            bin = bin/10;
            cnt++;
        }
        bin=s;
        while(bin>0)
        {
            int d=bin%10;
            bin =bin/10;
            sum += Math.pow(d,cnt);
            
        }
        if(s==sum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}