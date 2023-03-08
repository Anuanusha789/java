class Diamondchar
{
    public static void main(String args[])
    {
        int n=4;char start='A';
        for(int i=1;i<n;i++)
        
            System.out.print(" ");
            System.out.print(start);
            System.out.println();
        start++;
        for(int i=2,l=1;i<=n;i++,l+=2)
        {
            
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }System.out.print(start);
    
        for(int k=1;k<=l;k++)
        {
            System.out.print(" ");
    
        }
        System.out.print(start);
        
        
        start++;
        System.out.println();
    }
       
    }
}