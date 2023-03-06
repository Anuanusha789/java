class Kshape
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
             char start='A';
            for (int j=i;j>=1;j--)
           { System.out.print(start++);
           }
        System.out.println();}
        for(int i=1;i<=n;i++)
        { char start='A';
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(start++);
            }
            
            System.out.println();
        }
           
    }
}
