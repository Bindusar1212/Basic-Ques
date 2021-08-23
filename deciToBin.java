public class MyClass {
    public static void main(String args[]) {
        int n= 20;
        int[] b = new int[40];
        int index=0;
        while(n>0)
        {
            b[index++]=n%2;
            n=n/2;
        }
        
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(b[i]);
        }
        
        
    }
}