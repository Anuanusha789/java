class Pattern3
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
            System.out.print(" ");
            }
            for(int g=1;g<=i;g++)
            {
            System.out.print("*");
        }
        System.out.println();
    }
}
}