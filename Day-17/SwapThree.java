class SwapThree
{
    public static void main(String args[])
    {
        int a=9,b=3,c=4;
         a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.print(a+","+b+","+c);
    }
}