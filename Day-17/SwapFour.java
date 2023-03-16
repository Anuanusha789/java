class SwapFour
{
    public static void main(String args[])
    {
        int a=2,b=5,c=3,d=1;
        a=a+b+c+d;
        b=a-(b+c+d);
        c=a-(b+c+d);
        d=a-(b+c+d);
        a=a-(b+c+d);
        System.out.print(a+","+b+","+c+","+d);
    }
}